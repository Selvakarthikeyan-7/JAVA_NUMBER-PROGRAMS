import java.util.Scanner;

public class add_digits_in_givennumber {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        System.out.println("sum of the given number : "+  add_digits_in_given_number(number)  );
        sc.close();

    }

    public static int add_digits_in_given_number (int number){
        int sum=0;
        int rem=0;
while(number>0){
rem=number%10;
sum+=rem;
number=number/10;
}
return sum;
    }
}
