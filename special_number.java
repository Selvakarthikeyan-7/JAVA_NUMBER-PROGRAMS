import java.util.Scanner;

public class special_number {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
       
        if(number==Sum(number)+product(number)){
            System.out.println("The given number : " + number + " is a special two digit number");
        } else{
            System.out.println("The given number : " + number + " is not a special two digit number");
        }
        sc.close();
    }
    public static int product (int number){
        int product =1;
        int rem=0;
        while(number>0){
            rem=number%10;
            product*=rem;
            number=number/10;
        }
        return product;
    }
    public static int Sum (int number){
        int sum =0;
        int rem=0;
        while(number>0){
            rem=number%10;
            sum+=rem;
            number=number/10;
        }
        return sum;
    }
}
