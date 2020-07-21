


//        Set<Character> row = new HashSet<>();
//        Set<Character> column = new HashSet<>();
//        Set<Character> cube = new HashSet<>();
//        for(int i=0;i<9;i++){
//            for(int j=0;j<9;j++){
//                if(board[i][j] == '.') continue;
//
//
//                if(board[i][j]!='.'&&!row.add(board[i][j])){
//                    return false;
//                }
//                if(board[i][j]!='.'&&!column.add(board[i][j])){
//                    return false;
//                }
//                int cubeRow=3 * (i / 3) + j / 3;
//                int cubeCol = 3 * (i % 3) + j % 3;
//                if(board[cubeRow][cubeCol]!='.'&&!row.add(board[cubeRow][cubeCol]))
//                    return false;
//            }
//        }
//        return true;

package com.luv2code.springdemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Solution {


    public boolean isValidSoduku(char[][] board){




        Map<Integer, Set<Character>> rowSetMap = new HashMap<>();
        Map<Integer, Set<Character>> colSetMap = new HashMap<>();
        Map<Integer, Set<Character>> cubeSetMap = new HashMap<>();
        for(int i = 0; i < board.length; ++i) {
            for(int j = 0; j < board[i].length; ++j) {
                if(board[i][j] == '.') continue;

                Set<Character> rowSet = rowSetMap.get(i);
                if(null == rowSet) {
                    rowSet = new HashSet<>();
                    rowSetMap.put(i, rowSet);
                }

                Set<Character> colSet = colSetMap.get(j);
                if(null == colSet) {
                    colSet = new HashSet<>();
                    colSetMap.put(j, colSet);
                }

                int cubeindex = i/3 * 3 + j/3;
                Set<Character> cubeSet = cubeSetMap.get(cubeindex);
                if(null == cubeSet) {
                    cubeSet = new HashSet<>();
                    cubeSetMap.put(cubeindex, cubeSet);
                }

                if(!rowSet.add(board[i][j]) || !colSet.add(board[i][j]) || !cubeSet.add(board[i][j])) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        char[][] board1 ={{'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};


        char[][] board2 ={
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        Solution sol = new Solution();
        System.out.println(sol.isValidSoduku(board1));
        System.out.println(sol.isValidSoduku(board2));
    }
}
