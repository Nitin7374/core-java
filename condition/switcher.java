import java.util.*;
public class switcher {
  
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Button = sc.nextInt();
        switch (Button) {
            case 1: System.out.println("hello");
                break;
            case 2: System.out.println("Nameste");
                break;
            case 3: System.out.println("bonjour");
                break;
            default: System.out.println("invalid");    
        }
    }
    
}
