package com.coldraincn.cdcleet.medium;
/**
 * 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。

单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。

 

示例 1：


输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
输出：true
示例 2：


输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
输出：true
示例 3：


输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
输出：false
 

提示：

m == board.length
n = board[i].length
1 <= m, n <= 6
1 <= word.length <= 15
board 和 word 仅由大小写英文字母组成

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/word-search
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class WordSearch {
    private static final int[][] DIRECTIONS = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    private int rows, cols;
    private int len;
    private boolean[][] marked;
    private char[][] board;
    private char[] wordArray;
    public boolean exist(char[][] board, String word) {
        this.rows = board.length;
        if (rows == 0) return false;
        this.cols = board[0].length;
        if (cols == 0) return false;

        this.marked = new boolean[rows][cols];
        this.board = board;
        this.wordArray = word.toCharArray();
        this.len = word.length();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(int x, int y, int begin) {
        if (board[x][y] != wordArray[begin]) {
            return false;
        }
        if (begin == len - 1) {
            return true;
        }

        marked[x][y] = true;
        for (int[] directions: DIRECTIONS) {
            int newX = x + directions[0];
            int newY = y + directions[1];
            if (inMap(newX, newY) && !marked[newX][newY]) {
                if (dfs(newX, newY, begin + 1)) {
                    return true;
                }
            }
        }
        marked[x][y] = false;
        return false;
    }

    private boolean inMap(int x, int y) {
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }
}
