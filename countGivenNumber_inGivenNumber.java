import java.util.Scanner;

public class countGivenNumber_inGivenNumber {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("enter digit");
        int digit=sc.nextInt();
     System.out.println(count(number, digit));
     sc.close();
    }

    public static int count (int number, int digit){
        int count=0;
        int rem=0;
        while(number>0){
            rem=number%10;
            if(rem==digit){
                count+=1;
            }
            number=number/10;
        }
        return count;
    }
    
}
