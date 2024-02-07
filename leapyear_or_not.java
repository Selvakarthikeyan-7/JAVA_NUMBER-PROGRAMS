import java.util.Scanner;

/**
 * leapyear_or_not
 */
public class leapyear_or_not {

    public static void main(String[] args) {
        
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if( year<=0){
            System.out.println("invalid year");
        } else if ((year%4==0 &&  year%100!=0) || year%400==0) {
System.out.println("year : " + year + " is a leap year");
        }
        else{
            System.out.println("year : " + year + " is not a leap year");
        }
        sc.close();
    }
}
