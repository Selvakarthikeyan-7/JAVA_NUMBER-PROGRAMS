import java.util.Scanner;

/**
 * print_digits_in_givennumbers
 */
public class print_digits_in_givennumbers {

    public static void main(String[] args) {
        System.out.println("enter number");
    Scanner sc = new Scanner(System.in);
    int number= sc.nextInt();
    System.out.println("number : " + " " + number);
    System.out.println("digits : ");
    print_Number(number);
    sc.close();

    }

    public static void print_Number(int number){
String string_Of_Given_Number= Integer.toString(number);
for (int i=0; i<string_Of_Given_Number.length();i++){
    char digit= string_Of_Given_Number.charAt(i);
    int num = Character.getNumericValue(digit);
    System.out.println(num);
    
}
    }
    
}
