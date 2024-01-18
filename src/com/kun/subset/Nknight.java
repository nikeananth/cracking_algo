package com.kun.subset;

public class Nknight {

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println();
      // knight(board, 0, 0, 4);
        knight1(board, 0, 0, 4);
    }


    static void knight(boolean board[][],int row,int col,int knights){


        if(knights==0){
            display(board);
            System.out.println();
        }

        if(row==board.length-1&&col==board.length){
            return;
        }
        if(col>=board.length){
           knight(board,row+1,0,knights);
            return;
        }

        if(isSafe(board,row,col)){
            board[row][col]=true;
            knight(board,row,col+1,knights-1);
            board[row][col]=false;
        }
        knight(board,row,col+1,knights);
    }


    static void knight1(boolean board[][], int row, int col, int knights) {
        int n = board.length;

        // Base case: Display solution when no more knights need to be placed
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }

        // Iterate through each cell
        for (int i = 0; i < n * n; i++) {
            col = i % n;
            row = i / n;
            System.out.println(row+","+col);
            // Try placing a knight if the cell is safe
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                knight1(board, row, col, knights - 1);
                board[row][col] = false; // Backtrack
            }
        }
    }



    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row

        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
    }


    static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }



    private static void display(boolean[][] board) {

        for(boolean row[]:board){
            for(boolean element:row){
                if(element){
                    System.out.print("K");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println("");
        }

    }
}
