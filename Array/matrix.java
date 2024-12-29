import java.util.Scanner;

public class matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of rows");
        int rows = sc.nextInt();
        System.out.println("enter the size of cols");
        int cols = sc.nextInt();

        // create an array
        int number[][] = new int[rows][cols];

        // input
        System.out.println("enter the number of rows and cols");
        // for rows
        for (int i = 0; i < rows; i++) {
            // for cols
            for (int j = 0; j < cols; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        // enter x for identify ,matching with array and print
        System.out.println("enter x");
        int x = sc.nextInt();

        // output
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                // compare
                if (number[i][j] == x) {
                    System.out.println("x is found at index (" + i + ", " + j + ")");
                }
            }
        }
    }
}
