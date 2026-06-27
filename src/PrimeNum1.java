import java.util.Scanner;

class primeNum1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your number : ");
        int n = sc.nextInt();

        boolean isPrime = isPrime(n);
        if(isPrime){
            System.out.println(n + " is a Prime Number");
        }else {
            System.out.println(n + " is Not a Prime number");
        }
    }

    public static boolean isPrime(int n){
    int i = 2;
    while (i < n){
        if(n % i == 0){
            return false;
        }
        i++;
    }

    return true;
    }
}