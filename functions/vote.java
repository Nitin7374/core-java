import java.util.Scanner;

public class vote {
    public static boolean elgible(int age){
        if(age>=18){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();

        System.out.println(elgible(age));
    }
}
