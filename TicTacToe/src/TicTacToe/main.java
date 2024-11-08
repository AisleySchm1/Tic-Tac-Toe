package TicTacToe;

import java.util.Scanner;

public class main 
{
static String [][] board = new String [3][3];
    
    public static void main(String[] args) 
  {
    prepareBoard();
    displayBoard();
    boolean isPlaying = true;
    while(isPlaying)
      {
    playerCordinate();
    displayBoard();
    isWonGame();
    computerCordinate();
    displayBoard();
    isWonGame();
        
      }
    
  }

    public static void prepareBoard()
    {
      for (int row = 0; row < board.length; row ++)
      {
        System.out.println();
       for (int col = 0; col < board[0].length; col ++) 
         {
         board[row][col] = " ";
         }
    }
    }

    public static void displayBoard()
  {
    System.out.println("  1   2   3  ");
    System.out.println("- - - - - - - -");
    System.out.println("A| "+board[0][0]+" | "+board[0][1]+" | "+board[0][2]+" | ");
    System.out.println("- - - - - - - -");
    System.out.println("B |"+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+" | ");
    System.out.println("- - - - - - - -");
    System.out.println("C| "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" | ");
    System.out.println("- - - - - - - -");
  }
    public static void playerCordinate()
    {
    Scanner userInput=new Scanner(System.in);
    System.out.println("Let's play Tic Tac Toe! What is your move?");
    String cordinate = userInput.nextLine();
    cordinate = cordinate.toUpperCase();

    if(cordinate.equals("A1"))
  {
    board[0][0] = "X";
  }
else if(cordinate.equals("A2"))
{
  board[0][1] = "X";
}
else if(cordinate.equals("A3"))
{
  board[0][2] = "X";
}
else if(cordinate.equals("B1"))
{
  board[1][0] = "X";
}
else if(cordinate.equals("B2"))
{
  board[1][1] = "X";
}
else if(cordinate.equals("B3"))
{
  board[1][2] = "X";
}
else if(cordinate.equals("C1"))
{
  board[2][0] = "X";
}
else if(cordinate.equals("C2"))
{
  board[2][1] = "X";
}
else if(cordinate.equals("C3"))
{
  board[2][2] = "X";
}
    }

    public static void isWonGame()
		{
		if ((board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2]) && !board[0][1].equals(" ")) ||
			(board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2]) && !board[1][1].equals(" ")) ||
			(board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2]) && !board[2][1].equals(" ")) ||
			(board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0]) && !board[1][0].equals(" ")) ||				
			(board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1]) && !board[1][1].equals(" ")) ||
			(board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2]) && !board[1][2].equals(" ")) ||
			(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[1][1].equals(" ")) ||
			(board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[1][1].equals(" ")))
			{
			System.out.println("The game is over!");
			System.exit(0);
			}
		}


    public static void computerCordinate()
    {
      int numberRow = (int) (Math.random()*3);
      int numberCol = (int) (Math.random()*3);

      if (board[numberRow][numberCol].equals (" "))
      {
        board[numberRow][numberCol] = "O";
      }
      else 
      {
        computerCordinate();
      }
    }
}
