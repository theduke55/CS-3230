package assignments;

import java.util.Scanner;

/**
 *
 * @author Trevor Barker
 * @description: the user will enter the number of rows and columns along with
 * the single digit integers for the multi-dimensional array. The program will
 * then determine if four numbers are in a consecutive order.
 * @due date: 05/26/2018
 */
public class ConsecutiveFour {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Collect the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        // Collect the number of columns
        System.out.print("Enter the number of columns: ");
        int col = input.nextInt();

        // Collect the numbers to fill the array
        System.out.print("Enter " + rows * col + " single digit numbers with a space separating each then hit enter (ex. 1 2 3 4 5 6): ");

        // Fill the array
        int[][] array = new int[rows][col];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = input.nextInt();
                //System.out.print(array[i][j] + " ");
            }
            //System.out.println();
        }

        System.out.println(isConsecutiveFour(array));
    }// end of main

    public static boolean isConsecutiveFour(int[][] values) {
        int number = values[0][0];
        int counter = 0;
        boolean isConsecutive = false;
        int rows = values.length;
        int col = values[0].length;

        // Horizontal check
        for (int i = 0; i < values.length; i++) {
            counter = 0;
            for (int j = 0; j < values[i].length; j++) {
                if (values[i][j] == number) {
                    counter++;
                    if (counter == 4) {
                        //System.out.println("Consecutive horizontal: " + values[i][j]);
                        return isConsecutive = true;
                    }
                } else {
                    number = values[i][j];
                    counter = 1;
                }
            }
        }

        // Vertical check
        for (int j = 0; j < col; j++) {
            counter = 0;
            for (int i = 0; i < rows; i++) {
                if (values[i][j] == number) {
                    counter++;
                    if (counter == 4) {
                        //System.out.println("Consecutive vertical: " + values[i][j]);
                        return isConsecutive = true;
                    }
                } else {
                    number = values[i][j];
                    counter = 1;
                }
            }
        }

        // Diagonal check
        //checking left to right
        for (int row = 3; row < rows; row++) { //checking rows 0 to 2
            for (int column = 0; column < (col - 3); column++) { //checking columns 0 to 3
                if (values[row][column] == values[row - 1][column + 1] && values[row][column] == values[row - 2][column + 2] && values[row][column] == values[row - 3][column + 3]) {
                    //System.out.println("Consecutive diagonal left to right: " + values[row][column]);
                    return isConsecutive = true;
                }
            }
        }
        
        //checking right to left
        for (int row = 0; row < (rows - 3); row++) { //checking rows 0 to 2
            for (int column = 0; column < (col - 3); column++) { //checking columns 0 to 3
                if (values[row][column] == values[row + 1][column + 1] && values[row][column] == values[row + 2][column + 2] && values[row][column] == values[row + 3][column + 3]) {
                    //System.out.println("Consecutive diagonal right to left: " + values[row][column]);
                    return isConsecutive = true;
                }
            }
        }
        return isConsecutive;
    }// end of isConsecutiveFour

}
