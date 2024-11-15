import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        // displaying operator choice/
        System.out.println("choose an operator:");
        System.out.println("1: (addition) a + b");
        System.out.println("2: (subtraction) a - b");
        System.out.println("3: (multiple) a * b");
        System.out.println("4: (division) a / b");
        System.out.println("5: (remender) a % b");

        System.out.println("enter your choice(1-5)");
        int choice =sc.nextInt();

        // calculating and displaying the result on the basis of your choice 

        switch (choice) {
            case 1: System.out.println("result:" +(a + b) );
            break;

            case 2: System.out.println("result:" +(a - b));
            break;

            case 3: System.out.println("result:" +(a * b));
            break;

            case 4: if(b!=0){
                System.out.println("result:" +(a / b));
            }else{
                System.out.println("error: division by zero");
            }
            break;

            case 5:  if(b!=0){
                System.out.println("result:" +(a % b));
            }else{
                System.out.println("error: division by zero");
            }
            break;
            default: System.out.println("invalid");
        }
    }

}
