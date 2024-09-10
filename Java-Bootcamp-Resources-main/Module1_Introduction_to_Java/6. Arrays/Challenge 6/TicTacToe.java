import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
            System.out.println("\nLet's play tic tac toe");

            //Task 1: Create an array with three rows of '_' characters.
          char[][] grid = {{'_', '_', '_'}, {'_', '_','_'}, {'_', '_', '_'}};
            
            //Task 2: Call the function printBoard();


            char[][] testBoard = {{'X', 'X', 'X'}, {'X', 'X','X'}, {'X', 'X', 'X'}};
            printBoard(grid) ;

              /*
              Task 3: Loop through turns.
                  */

              char turn = ' '; 
                  for (int i = 0; i < 10; i++) {
                    // System.out.println(i);
                    if(i%2 == 0 ){
                      turn = 'X';
                      System.out.println("Turn: X");
                      int[] coordinates = askUser(grid);
                      grid[coordinates[0]][coordinates[1]] = 'X';
                      
                      System.out.println(Arrays.toString(grid[0]));

                      System.out.println(Arrays.toString(coordinates));
                      printBoard(grid);
                    } else {
                      turn = 'O';
                      System.out.println("Turn: O");
                     int[] coordinates =  askUser(grid);
                     grid[coordinates[0]][coordinates[1]] = 'O';
                     System.out.println(Arrays.toString(coordinates));
                     printBoard(grid);
                      
                    }
                  }
                  /*
                  if (X) turn {
                     Task 4: call askUser(). 
                     Task 5: populate the board using askUser's return value.
                  } else {
                      Task 4: call askUser(). 
                      Task 5: populate the board using askUser's return value. Then, print it.

                  }
                  
                Task 6 - Call the function.
                   if return value == 3 {
                     print: X wins and break the loop
                  } else if return value == -3 {
                     print: O wins and break the loop
                  }

              } 
              */
              checkWin(grid);
              if(checkWin(grid) == 3){
                System.out.println("X wins");
                System.exit(0);
              } else if(checkWin(grid) == -3){
                System.out.println("O wins");
                System.exit(0);
              }
            scan.close();
        }


    /** Task 2 - Write a function that prints the board.
     * Function name - printBoard()
     * @param board (char[][])
     * 
     * Inside the function:
     *   1. print a new line.
     *   2. print the board.
     *      • separate each row by two lines. 
     *      • each row precedes a tab of space
     *      • each character in the grid has one space from the other character
     */        
      public static void printBoard(char[][] board){
        System.out.println("\n");


        for (int i = 0; i < board.length; i++) {
          System.out.print("\t");
          for (int j = 0; j < board[i].length; j++) {
            System.out.print(board[i][j] + " "); 
          }
          System.out.println("\n\n");
        }
      }
   /** Task 4 - Write a function that lets the user choose a spot
     * Function name – askUser
     * @param board (char[][] board)
     * @return spot (int[])
     * 
     * Inside the function
     *   1. Asks the user: - pick a row and column number: 
     *   2. Check if the spot is taken. If so, let the user choose again.
     *   3. Return the row and column in an int[] array.
     * 
     */
    public static int[] askUser(char[][] board){
      System.out.print("- pick a row and a column number: ");
      int getRow = scan.nextInt();
      int getColumn = scan.nextInt();
      int[] spot = {getRow, getColumn};
      if(board[getRow][getColumn]== 'X' || board[getRow][getColumn] == 'O' || getColumn > 3 || getRow > 3){
       System.out.print("Spot taken, please choose another spot.");
       getRow = scan.nextInt();
       getColumn=scan.nextInt();
       spot[0] = getRow;
       spot[1]= getColumn;
       System.out.println(Arrays.toString(spot));

       return spot;
      } 
      else{
        System.out.println(Arrays.toString(spot));
        return spot;
        
      }
      
    }

    /** Task 6 - Write a function that determines the winner
     * Function name - checkWin 
     * @param board (char[][])
     * @return count (int)
     * 
     * Inside the function:
     *   1. checkRows(): Check every row for a straight X/O  (Task 7) <——
     *   2. checkColumns(): Check every column for a straight X/O  (Task 8)
     *   3. checkLeft(): Check the left diagonal for a straight X/O  (Task 9).
     *   4. checkRight(): Check the right diagonal for a straight X/O  (Task 10).

     */
    public static int checkWin(char[][] board){
      int count = 0;
    checkRows(board);
    checkColumns(board);
    checkLeft(board);
    checkRight(board);

   return count;
    }

    public static int checkRows(char[][] board){
      int count = 0;
      for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[i].length; j++) {
          if(board[i][j] ==  'X'){
            count+=1;
          }
          else if(board[i][j] == 'O'){
            count-=1;
          }
        }
      }
      return count;
    }


    public static int checkColumns(char[][] board){
      int count = 0;
      int x = 0;
      for (int i = 0; i < board.length; i++) {
          if(board[i][x] == 'X'){
            count +=1;
            x+=1;
          }
          else if(board[i][x] == 'O'){
            count -=1; 
            x+=1;
          }
      }
      return count;
    }

    public static int checkLeft(char[][] board){
      int count = 0;
      for (int i = 0; i < board.length; i++) {
        if(board[i][i] == 'X'){
          count+=1;
        } else if(board[i][i]== 'O'){
          count-=1;
        }
      }
      return count;
    }

    public static int checkRight(char[][] board){
      int count = 0;
      for (int i = board.length; i >= 0; i--) {
        if(board[i][i] == 'X'){
          count+=1;
        } else if(board[i][i]== 'O'){
          count-=1;
        }
      }
      return count;
    }
  }
