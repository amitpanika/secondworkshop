package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {

        char[][] gameboard = {{' ', '|', ' ', '|', ' '},
                {'_', '+', '_', '+', '_'},
                {' ', '|', ' ', '|', ' '},
                {'_', '+', '_', '+', '_'},
                {' ', '|', ' ', '|', ' '},};

        char[][] gameBoard = new char[0][];
        printGameBoard(gameBoard);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your placement ( 1-9):");
        int pos = scanner.nextInt();
        System.out.println(pos);
        gameBoard = new char[0][];
        switch (pos) {
            case 1:
                gameBoard[0][0] = 'X';
                break;
            case 2:
                gameBoard[0][2] = 'X';
                break;
            case 3:
                gameBoard[0][4] = 'X';
                break;
            case 4:
                gameBoard[2][0] = 'X';
                break;
            case 5:
                gameBoard[2][2] = 'X';
                break;
            case 6:
                gameBoard[2][4] = 'X';
                break;
            case 7:
                gameBoard[4][0] = 'X';
                break;
            case 8:
                gameBoard[4][2] = 'X';
                break;
            case 9:
                gameBoard[4][4] = 'X';
                break;
        }
        printGameBoard(gameBoard);
    }
    private static void printGameBoard(char[][] gameBoard) {
        gameBoard = new char[0][0];
        for ( char[] row : gameBoard) {
            for ( char c : row ) System.out.println(c);
            System.out.println();
    }



    }

}