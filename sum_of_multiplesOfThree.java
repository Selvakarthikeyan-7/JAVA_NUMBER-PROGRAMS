import java.util.Scanner;

public class sum_of_multiplesOfThree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int number= sc.nextInt();
        int rem=0;
        int sum=0;
        while(number>0){
        rem=number%10;
        if(multiples_of_3(rem)==true){
        sum+=rem;
        }
        number=number/10;
        }
        System.out.println("sum of multiple of 3 in given number is : " + sum);
        sc.close();
    }

    public static boolean multiples_of_3 (int number){
       boolean multiple=false;
       if(number%3==0){
        multiple=true;
       }
       else{
        multiple=false;
       }
        return multiple;
    }
}
