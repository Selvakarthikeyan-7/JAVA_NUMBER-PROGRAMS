import java.util.Scanner;

public class odd_or_even {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
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
   sc.close();
   }
   
    }

    

