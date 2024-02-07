import java.util.Scanner;

public class niven_number {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        niven_num(number);
        sc.close();
    }
    public static void niven_num(int number){
    int rem=0;
    int orginalnumber = number;
    int sum=0;
    while(number>0){
        rem=number%10;
       sum+=rem;
       number=number/10;
    }
    if (orginalnumber%sum==0){
        System.out.println("The given number is Niven number");
    } else{
        System.out.println("The given number is not a Niven number");
    }
    }
}
