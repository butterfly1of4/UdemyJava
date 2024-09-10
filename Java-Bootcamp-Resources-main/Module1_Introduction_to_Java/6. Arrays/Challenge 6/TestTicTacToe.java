import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;
import java.util.Scanner;

public class TestTicTacToe {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\nLet's play tic tac toe");

        // char[][] grid = { { '_', '_', '_' }, { '_', '_', '_' }, { '_', '_', '_' } };

        char[][] testBoard = { { 'X', 'X', 'O' }, { 'X', 'X', 'X' }, { 'O', 'O', 'O' } };

        printBoard(testBoard);
/** 
 

        char turn = ' ';
        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                turn = 'X';
                System.out.println("Turn: X");
                int[] coordinates = askUser(testBoard);
                testBoard[coordinates[0]][coordinates[1]] = 'X';

                System.out.println(Arrays.toString(testBoard[0]));

                System.out.println(Arrays.toString(coordinates));
                printBoard(testBoard);
            } else {
                turn = 'O';
                System.out.println("Turn: O");
                int[] coordinates = askUser(testBoard);
                testBoard[coordinates[0]][coordinates[1]] = 'O';
                System.out.println(Arrays.toString(coordinates));
                printBoard(testBoard);

            }
        }
*/
        checkWin(testBoard);

        if (checkWin(testBoard) == 3) {
            System.out.println("X wins");
            System.exit(0);
        } else if (checkWin(testBoard) == -3) {
            System.out.println("O wins");
            System.exit(0);
        }
        scan.close();
    }

    public static void printBoard(char[][] board) {
        System.out.println("\n");

        for (int i = 0; i < board.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("\n\n");
        }
    }
    public static int[] askUser(char[][] board) {
        System.out.print("- pick a row and a column number: ");
        int getRow = scan.nextInt();
        int getColumn = scan.nextInt();
        int[] spot = { getRow, getColumn };
        if (board[getRow][getColumn] == 'X' || board[getRow][getColumn] == 'O' || getColumn > 3 || getRow > 3) {
            System.out.print("Spot taken, please choose another spot.");
            getRow = scan.nextInt();
            getColumn = scan.nextInt();
            spot[0] = getRow;
            spot[1] = getColumn;
            System.out.println(Arrays.toString(spot));

            return spot;
        } else {
            System.out.println(Arrays.toString(spot));
            return spot;

        }
    }


    public static int checkWin(char[][] board) {
        int count = 0;
        checkRows(board);
        checkColumns(board);
        checkLeft(board);
        checkRight(board);
        return count;
    }
    public static int checkRows(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            count = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    count += 1;
                } else if (board[i][j] == 'O') {
                    count -= 1;
                }
            if(count == 3 || count == -3){
                return count;
            }
        
            }
        }
        return count;
    }

    public static int checkColumns(char[][] board) {
        int count = 0;
        int x = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][x] == 'X') {
                count += 1;
                x += 1;
            } else if (board[i][x] == 'O') {
                count -= 1;
                x += 1;
            }
        }
        return count;
    }

    public static int checkLeft(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                count += 1;
            } else if (board[i][i] == 'O') {
                count -= 1;
            }
        }
        return count;
    }

    public static int checkRight(char[][] board) {
        int count = 0;
        for (int i = board.length; i >= 0; i--) {
            if (board[i][i] == 'X') {
                count += 1;
            } else if (board[i][i] == 'O') {
                count -= 1;
            }
        }
        return count;
    }
}
