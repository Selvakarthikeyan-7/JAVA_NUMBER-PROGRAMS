import java.util.Scanner;

/**
 * sum_of_PrimeNumber
 */
public class sum_of_PrimeNumber {

    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
      System.out.println(sumof_primeNumber(number));
        sc.close();

    }
    public static int sumof_primeNumber (int number){
        int sum=0;
        int rem=0;
        while(number>0){
            rem=number%10;
            if(Isprimenumber(rem)==true){
                sum+=rem;
            }
            number=number/10;
        }
       return sum;
    }
    public static boolean Isprimenumber (int digit){
        boolean yes_or_no=false;
        int count=0;
        if(digit==2){
            yes_or_no=true;
        }
        else{
        for(int i=2; i<digit;i++){
        if(digit%i==0){
            count+=1;
        }
        if(count==0){
            yes_or_no=true;
        }
        else{
            yes_or_no=false;
        }
        }
    }
        return yes_or_no;
    }
}