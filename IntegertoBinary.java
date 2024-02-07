import java.util.Scanner;

public class IntegertoBinary {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
     String binary = Binary(number);
     int binarynumber = Integer.parseInt(binary);
     System.out.println("the binary number of given number is : " + binarynumber);
     sc.close();
    }
    public static String Binary (int number){
        String Binary=(Integer.toBinaryString(number));
        return Binary;
    }
    
}
