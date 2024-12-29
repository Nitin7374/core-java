import java.util.Scanner;

public class sort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();

        // create an array
        int number[] = new int[size];
        // input
        System.out.println("enter the number of array");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < number.length; i++) {
            if (number[i] < number[i - 1]) {
                ascending = false;
            }
            if (number[i] > number[i - 1]) {
                descending = false;
            }
        }
        if (ascending) {
            System.out.println("the array is sorted in ascending order ");
        } else if (descending) {
            System.out.println("the array is sorted in descending order");
        } else {
            System.out.println("the array is not sorted");
        }
    }
}
