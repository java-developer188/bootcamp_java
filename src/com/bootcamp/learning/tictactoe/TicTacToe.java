package com.bootcamp.learning.tictactoe;
import java.util.Scanner;

public class TicTacToe {
  static Scanner sc = new Scanner(System.in);
  static char[][] board = new char[3][3];
  static char currentPlayer = 'X';

  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[i][j] = ' ';
      }
    }

    while (!isGameOver()) {
      System.out.println("Current board:");
      printBoard();
      System.out.println("Player " + currentPlayer + ", enter your move (row[1-3] column[1-3]):");
      int row = sc.nextInt() - 1;
      int col = sc.nextInt() - 1;
      board[row][col] = currentPlayer;
      currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    System.out.println("Current board:");
    printBoard();
    char winner = (currentPlayer == 'X') ? 'O' : 'X';
    System.out.println("Player " + winner + " wins!");
  }

  public static boolean isGameOver() {
    for (int i = 0; i < 3; i++) {
      if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
        return true;
      }
    }

    for (int j = 0; j < 3; j++) {
      if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != ' ') {
        return true;
      }
    }

    if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
      return true;
    }

    if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
      return true;
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (board[i][j] == ' ') {
          return false;
        }
      }
    }

    return true;
  }

  public static void printBoard() {
    System.out.println("-------------");
    for (int i = 0; i < 3; i++) {
      System.out.print("| ");
      for (int j = 0; j < 3; j++) {
        System.out.print(board[i][j] + " | ");
      }
      System.out.println();
      System.out.println("-------------");
    }
  }
}
