import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        fibonacci(number);
        sc.close();
    }
    public static void fibonacci (int number){
        int n1=0;
        int n2=1;
        System.out.print(n1 + " " + n2);
        
      
        
        
        for (int i=2; i<number;i++){
           
                
            int n3= n1+n2;
            System.out.print(" " + n3);
            n1=n2;
            n2=n3;
            
            
        }
        }
    }

