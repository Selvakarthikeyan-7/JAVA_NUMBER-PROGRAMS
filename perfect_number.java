import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        if(number==sum_of_divisible(number)){
            System.out.println(number + " : is perfect number");
        }
        else{
            System.out.println(number + " : is not a perfect number");
        }
        sc.close();
    }
    public static int sum_of_divisible(int number){
        int sum=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}
