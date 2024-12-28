import java.util.Scanner;

public class radius {
    public static double radiusofcircle(double radius){
        return 2 * 3.14 * radius;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        double r = sc.nextDouble();

        System.out.println(radiusofcircle(r));
    }
}
