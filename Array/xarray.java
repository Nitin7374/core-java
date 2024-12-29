// Take an array as input from the user. search for a given number x and print the index at which it occur
import java.util.Scanner;

public class xarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of size");
        int size = sc.nextInt();
        // creating array
        int number[] = new int[size];
        // input

        System.out.println("enter the element of array");
        for (int i = 0; i < size; i++) {

            number[i] = sc.nextInt();
        }
        // enter x where it match with array and print
        System.out.println("enter the x ");
        int x = sc.nextInt();
        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("x found at index " + i);
            }
        }

    }
}