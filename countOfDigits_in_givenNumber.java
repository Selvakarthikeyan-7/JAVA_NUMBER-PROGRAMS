import java.util.Scanner;

/**
 * countOfDigits_in_givenNumber
 */
public class countOfDigits_in_givenNumber {

    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("count of digits in given number is : " + countDigit(number));
        sc.close();
    }
    public static int countDigit (int number){
        int count=0;
        int rem=0;
        while(number>0){
            rem=number%10;
            count+=1;
            number=number/10;
        }
        return count;
    }
}