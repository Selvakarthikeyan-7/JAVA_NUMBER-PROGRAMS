import java.util.Scanner;

public class amstrong_Number {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        if (number==sum_of_cubic_ofDigits(number)){
            System.out.println(number + " is a amstrong number");
        } else{
            System.out.println(number + " is not a amstrong number");
        }
        sc.close();
    }

    public static int sum_of_cubic_ofDigits(int number){
        int cubicSum=0;
      
       int cubic=0;
        int rem=0;
        while(number>0){
            rem=number%10;
            cubic=(int)(Math.pow(rem, 3));
            
            cubicSum+=cubic;
            number=number/10;
        }
      return cubicSum;
    }

}
