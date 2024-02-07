import java.util.Scanner;

public class duckNumber {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
       if(duck_Number(number)==true){
        System.out.println("the given nuumber is duck number");
       }
       else{
        System.out.println("The given number is not a duck number");
       }
       sc.close();
    }

public static boolean duck_Number (int number){
    boolean a=false;
    String number_String = Integer.toString(number);
    if(number_String.startsWith("0")){
      a=false;
    }
    else if (number_String.contains("0")){
    a=true;
    }
return a;
}
}
