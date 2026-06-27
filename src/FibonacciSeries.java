import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Series...");
        System.out.print("Enter a Number: ");
        int n = s.nextInt();
        int i = 3;
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci Series: " + a + "  " + b + " ");
        int c;
        while(i<=n){
            c = a + b;
            System.out.print(" " + c + " ");
            a = b;
            b = c;
            i++;
        }
    }
}
