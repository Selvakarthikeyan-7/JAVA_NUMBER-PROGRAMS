import java.util.Scanner;

public class sum_of_evenAndOddnumbers {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum_of_odd=0;
        int  sum_of_even=0;
        for (int i=1; i<=number;i++){
            if(i%2==0){
                sum_of_even+=i;
            }
            else{
                sum_of_odd+=i;
            }
        }
        System.out.println("sum_of_odd_numbers : " + sum_of_odd);
        System.out.println("sum_of_even_numbers : " + sum_of_even);
        sc.close();
    }
    
}
