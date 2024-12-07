public class tripara {
    public static void main(String args[]){
        int n =5;
        // outer loop 
        for(int i =1; i<=n; i++){
            // spaces 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // number with 1st half
            for(int j =i; j>=1;j--){
                System.out.print(j);
        
            }
            // number with 2nd half 
            for(int j=2; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
