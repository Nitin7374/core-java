public class inverthalfnum {
    public static void main(String args[]){
        int n= 5;
        // inner loop 
        for(int i= n;i>=1;i--){
            // inner loop 
            for(int j=1;j<=i;j++){
              System.out.print(j);
            }
            System.out.println();
        }
    }
}
