//package com.itranswarp.learnjava.offer12;
//
//import java.util.*;
//
//public class PathInMatrix {
//
//    public boolean exist(char[][] board, String word) {
//
//        // 将字符串变为字符数组
//        char[] words = word.toCharArray();
//
//        List<Index> startList = new ArrayList<>();
//        // 找到路径的开头在哪一个地方
//        startList = findStart(board, words[0]);
//
//
//        //
//        Map<String, NextChar> nextChars = new HashMap();
//
//        // 找到上下左右的字符，以及该字符的坐标
//        for (Index startPoint : startList) {
//            nextChars = findNextChars(board, startPoint);
//
//        }
//
//
//
//
//        return false;
//    }
//
//    private Map<String, NextChar> findNextChars(char[][] board, Index startPoint) {
//
//        Map<String, NextChar> nextChars = new HashMap<>();
//        int row = startPoint.row;
//        int column = startPoint.column;
//
//        //左点
//        if (column - 1 < 0) {
//            nextChars.put("left", null);
//        } else {
//            nextChars.put("left", new NextChar(board[row, column-1],new Index(row, column - 1);))
//
//        }
//    }
//
//    private List<Index> findStart(char[][] board, char startchar) {
//        List<Index> startList = new ArrayList<>();
//
//        int rows = board.length;
//        int column = board[0].length;
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < column; j++) {
//                if (board[i][j] == startchar) {
//                    startList.add(new Index(i, j));
//                }
//            }
//        }
//
//        return startList;
//    }
//
//    private class Index {
//        int row;
//        int column;
//
//        public Index(int _row, int _column) {
//            row = _row;
//            column = _column;
//        }
//    }
//
//    private class NextChar {
//        char aChar;
//        Index index;
//
//        public NextChar(char _char, Index _index) {
//            aChar = _char;
//            index = _index;
//        }
//    }
//
//
//
//
//}
