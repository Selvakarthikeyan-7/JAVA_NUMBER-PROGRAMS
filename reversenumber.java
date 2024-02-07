import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("the reversed number is : ");
       reverse(number);
       sc.close();
    }
    public static void reverse (int number){
        int rem=0;
        while(number>0){
            rem=number%10;
            System.out.print(rem);
            number=number/10;
        }
    }
}
