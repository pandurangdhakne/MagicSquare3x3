
/*

H E B C I G F A D   
1 2 3 4 5 6 7 8 9


A   B   C
8   3   4

H   I   D
1   5   9

G   F   E
6   7   2



*/

import java.util.*;

public class MagicSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(i + "," + j + " : ");

                matrix[i][j] = sc.nextInt();

            }

        }

        System.out.println("\n\n");
        // Switch case start

        while (true) {

            System.out.println(
                    "1st : Matrix print\n2nd : Logic row count\n3rd : Logic coloum count\n4th : Logic diagonal count\n5th : Row position change\n6th : Row position change then that matrix element addition\n7th : Original Matrix turn to 180 degree");
            int choice;
            System.out.print("Enter your choice = ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // MATRIX PRINT

                    System.out.println();

                    for (int i = 0; i < matrix.length; i++) {
                        System.out.print("row : " + "[" + i + "]" + " : ");

                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("\n\n");
                    break;

                case 2:

                    // LOGIC ROW COUNT

                    System.out.println("\n\n");

                    int rowNum;

                    for (int i = 0; i < matrix.length; i++) {
                        int sum = 0;
                        System.out.print("Row Number: ");
                        rowNum = sc.nextInt();

                        if (rowNum == i + 1) {

                            for (int j = 0; j < matrix[i].length; j++) {
                                sum = sum + matrix[i][j]; // row element sum

                            }

                        }
                        System.out.println("row sum : " + sum); // row element count

                    }

                    System.out.println("\n\n");

                    break;

                case 3:
                    // LOGIC COLUME COUNT
                    System.out.println("\n\n");
                    int colNum;
                    int k = 1;

                    while (k <= n) {
                        int colsum = 0;
                        System.out.print("Col Number: ");
                        colNum = sc.nextInt();
                        for (int i = 0; i < matrix.length; i++) {

                            for (int j = 0; j < matrix[i].length; j++) {

                                if (colNum == j + 1) {
                                    colsum = colsum + matrix[i][j];
                                }

                            }

                        }

                        System.out.print("col sum : " + colsum);
                        System.out.println("\n\n");

                        k++;
                    }

                    break;

                case 4:

                    // LOGIC DIAGONAL COUNT
                    System.out.println("\n\n");
                    for (int i = 1; i <= 2; i++) {

                        System.out.println(
                                "\n1st top left to bottom right diagonal\n2nd top right to bottom left diagonal \n");
                        int B;
                        System.out.print("Enter the choice : ");
                        B = sc.nextInt();

                        switch (B) {
                            case 1: // Top Left Bottom Right ( \ )
                                System.out.println("\n\n");
                                int top_left_bottom_right_diagonal = 0;

                                for (int j = 0; j < matrix.length; j++) {

                                    for (int L = 0; L < matrix[j].length; L++) {
                                        if (j == L) {
                                            top_left_bottom_right_diagonal = top_left_bottom_right_diagonal
                                                    + matrix[j][L];
                                        }
                                    }

                                }

                                System.out.print("top_left_bottom_right_diagonal =  " + top_left_bottom_right_diagonal);
                                System.out.println("\n\n");

                                break;

                            case 2: // Top Right Bottom Left ( / )
                                System.out.println("\n\n");
                                int topLeftBottomRightDiagonal = 0;

                                for (int M = matrix.length - 1; M >= 0; M--) {

                                    for (int P = matrix[M].length - 1; P >= 0; P--) {

                                        if (M == P) {
                                            topLeftBottomRightDiagonal = topLeftBottomRightDiagonal + matrix[M][P];
                                        }

                                    }

                                }

                                System.out.print("topLeftBottomRightDiagonal =  " + topLeftBottomRightDiagonal);
                                System.out.println("\n\n");

                                break;

                            default:

                                System.out.println("No Diagonal");

                                break;
                        }

                    }

                    System.out.println("\n\n");

                    break;

                case 5:
                    // Row position change
                    System.out.println("\n\n");
                    for (int i = matrix.length - 1; i >= 0; i--) {
                        int rowsum = 0;

                        System.out.print("row: " + "[" + i + "]" + " : ");

                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.print(matrix[i][j] + "  ");

                        }

                        System.out.println();
                    }

                    System.out.println("\n\n");

                    break;

                case 6:

                    // Row position change then that matrix element addition
                    System.out.println("\n\n");
                    for (int i = matrix.length - 1; i >= 0; i--) {
                        int rowsum = 0;

                        System.out.println("row : " + "[" + i + "]");

                        for (int j = 0; j < matrix[i].length; j++) {
                            rowsum = rowsum + matrix[i][j];
                        }

                        System.out.print("rowsum  of row  " + "[" + i + "]" + " : " + rowsum);

                        System.out.println();

                    }

                    System.out.println("\n\n");

                    break;

                case 7:

                    // Original Matrix turn to 180 degree
                    System.out.println("\n\n");
                    for (int i = matrix.length - 1; i >= 0; i--) {

                        System.out.print("row: " + "[" + i + "]");

                        for (int j = matrix[i].length - 1; j >= 0; j--) {
                            System.out.print(matrix[i][j] + " ");
                        }

                        System.out.println("\n\n");

                    }

                    break;

                default:
                    System.out.println("####### Error Contain Magic Square #######");
                    break;
            }

        }

        // Switch case end

    }

}
