import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        if(number==reverse(number)){
            System.out.println("The given number is palindrome");
        }
        else{
            System.out.println("The given number is not a palindrome");
        }
        sc.close();
    }
    public static int reverse (int number){
        
        String numberStr= Integer.toString(number);
        String revStr= "";
        for (int i=numberStr.length()-1; i>=0;i--){
            revStr+=numberStr.charAt(i);
        }
       int revString=Integer.parseInt(revStr);
       return revString;
    }
    
}
