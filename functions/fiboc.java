import java.util.Scanner;

public class fiboc {
    public static void fibbico(int n){
        int a =0,b=1;
        if(n<=0){
            System.out.println("enter positive number");
           return;
        }
        System.out.print(a);
        if(n > 1){
            System.out.print(" "+ b);
        }
         
        for(int i = 2; i<n; i++){
          int  nextterm = a+b; 
           System.out.print(" "+nextterm);
          a = b;
          b = nextterm;
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        fibbico(n);
    }
}
