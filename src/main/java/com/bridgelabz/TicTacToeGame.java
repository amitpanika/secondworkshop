package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {

        char[][] gameboard = {{' ', '|', ' ', '|', ' '},
                {'_', '+', '_', '+', '_'},
                {' ', '|', ' ', '|', ' '},
                {'_', '+', '_', '+', '_'},
                {' ', '|', ' ', '|', ' '},};


        printGameBoard(gameboard);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your placement ( 1-9):");
        int pos = scanner.nextInt();
        System.out.println(pos);
        switch (pos) {
            case 1:
                gameboard[0][0] = 'X';
                break;
            case 2:
                gameboard[0][2] = 'X';
                break;
            case 3:
                gameboard[0][4] = 'X';
                break;
            case 4:
                gameboard[2][0] = 'X';
                break;
            case 5:
                gameboard[2][2] = 'X';
                break;
            case 6:
                gameboard[2][4] = 'X';
                break;
            case 7:
                gameboard[4][0] = 'X';
                break;
            case 8:
                gameboard[4][2] = 'X';
                break;
            case 9:
                gameboard[4][4] = 'X';
                break;
        }
        printGameBoard(gameboard);
    }

    private static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row){
                System.out.print(c);
            }
            System.out.println();
        }


    }

}