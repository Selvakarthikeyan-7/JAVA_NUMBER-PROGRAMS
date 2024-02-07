import java.util.Scanner;

public class fibonacciRecursion {
    public static void main(String[] args) {
       System.out.println("Enter number");
       Scanner sc = new Scanner(System.in);
       int number=sc.nextInt();

       for (int i=0;i<number;i++){
        System.out.print(recursion(i)+ " ");
       }
       sc.close();
    }
    public static int recursion (int number){
        if(number<=1){
          return number;
        } else {
            return recursion(number-1) + recursion(number-2);
        }
        
    }
}
