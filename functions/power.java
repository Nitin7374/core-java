import java.util.Scanner;

public class power {

    public static double power(double x,double n){
        return Math.pow(x,n);
    }
    public static void main(String args[]){

        System.out.println("enter the value of x and n");
        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        double x=sc.nextDouble();
        System.out.print("n = ");
        double n=sc.nextDouble();

        System.out.println("Result "+power(x, n));
    }
}
