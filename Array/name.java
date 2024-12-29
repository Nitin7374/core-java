// Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;

public class name {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int size = sc.nextInt();
        // create an array
        String name[] = new String[size];

        // input
        System.out.println("enter the name of array");
        for (int i = 0; i < size; i++) {
            name[i] = sc.next();
        }
        // output
        for (int i = 0; i < name.length; i++) {
            System.out.println("name " + (i + 1) + " is " + name[i]);
        }

    }
}
