import java.util.Scanner;

/**
     * print_prime_numbers
     */
    public class print_prime_numbers {
    
        public static void main(String[] args) {
            System.out.println("enter number");
            Scanner sc = new Scanner(System.in);
            int number= sc.nextInt();
            for (int i=2;i<=number;i++){
                if(primeNumber(i)==true){
                    System.out.println(i);
                }
            }
            sc.close();
        }

        public static boolean primeNumber(int number){
            boolean a=false;
            int count=0;
            if (number==2){
                a=true;
            }
            else{
                for (int i=2;i<number;i++){
                    if(number%i==0){
                        count+=1;
                    }
                }
                if(count==0){
                    a=true;
                }
                else{
                    a=false;
                }

            }
            
            return a;
        }
    }
