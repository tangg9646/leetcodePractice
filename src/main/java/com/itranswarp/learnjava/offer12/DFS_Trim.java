package com.itranswarp.learnjava.offer12;

public class DFS_Trim {

    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // 深度优先遍历
                // level params  最后一个参数，是当前匹配的word中的第几个字符
                if (dfs(board, words, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, char[] words, int i, int j, int k) {

        // 终止条件
            // 如果不符合要求，返回false，在上层嵌套for循环中，不进入if语句
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != words[k]) {
            return false;
        }
            // 如果找到了符合条件的字符
        if (k == words.length - 1) {
            return true;
        }

        // 处理当前层的逻辑
        char temp = board[i][j];
        board[i][j] = '/';

        // 下探下一层
            // 在上下左右四个方向尝试下探，能否找到符合条件的字符，这里只要能任意找到一个即可，
            // 找到后再次下探
        boolean res = dfs(board, words, i - 1, j, k + 1) || dfs(board, words, i + 1, j, k + 1) ||
                dfs(board, words, i, j - 1, k + 1) || dfs(board, words, i, j + 1, k + 1);

        // 处理变量
        board[i][j] = temp;

        return res;
    }

}
