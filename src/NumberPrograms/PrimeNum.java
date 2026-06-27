import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number to find prime or not: ");
        int n = s.nextInt();
        boolean isPrime = true;
        int i = 2;

        while (i <= n/2){
            if(n % i == 0){
                 isPrime = true;
                       break;
            }else{
                isPrime = false;

            }
            i++;

        }
        if (isPrime){
            System.out.println(n + " is not a prime number");
        }else {
            System.out.println(n + " is a prime number");
        }


    }
}
