import java.util.Scanner;

public class twoDarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of rows");
        int rows = sc.nextInt();
        System.out.println("enter the size of cols");
        int cols = sc.nextInt();

        // create an array
        int number[][] = new int[rows][cols];

        System.out.println("enter the number of rows and cols");
        // input

        // for rows
        for (int i = 0; i < rows; i++) {
            // for cols
            for (int j = 0; j < cols; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(number[i][j]  + "  ");
            }
            System.out.println();
        }
    }
}