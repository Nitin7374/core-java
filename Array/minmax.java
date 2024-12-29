import java.util.Scanner;

public class minmax {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int size =sc.nextInt();
        // create an array 
        int number[]=new int[size];
            // input 
        System.out.println("enter the  number of size");
        for(int i=0; i<size; i++){
          number[i]=sc.nextInt();

        }

        int min =0;
        int max = 0;

        for(int i =0; i<number.length; i++){
            if(number[i]< min){
                min = number[i];
            }
            if(number[i]> max){
                max = number[i];
            }
        }
        System.out.println("smallest number min " + min);
        System.out.println("largest number max " + max);
      
    }
}
