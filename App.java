import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         try (Scanner sc = new Scanner(System.in)) {
            int num=sc.nextInt();
            if(num<=0){
System.out.println("invalid number");
            }
            else if (num%2==0){
System.out.println("number : " + num + " is even");
            }
            else{
                System.out.println("number : " + num + " is odd");
            }
        }
    }
}
