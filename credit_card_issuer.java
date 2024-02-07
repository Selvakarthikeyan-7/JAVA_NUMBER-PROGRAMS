import java.util.Scanner;

/**
 * credit_card_issuer
 */
public class credit_card_issuer {

    public static void main(String[] args) {
        System.out.println("Enter credit score");
        Scanner sc= new Scanner(System.in);
        int credit_score = sc.nextInt();
        if(credit_score>=400 && credit_score<=600){
            System.out.println("Silver card");
        }
        if(credit_score>600 && credit_score<=800){
            System.out.println("Gold card");
        }
        if(credit_score>800 && credit_score<=850){
            System.out.println("Platinum card");
        }
        sc.close();
    }
    
}