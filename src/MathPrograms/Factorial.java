import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Factorial Calculator...");
        System.out.print("Enter a Number to find Factorial: ");
        int n = s.nextInt();
        int i = 1;
        double ans = 1;
        while(i <= n){
            ans = ans * i;
            i++;
        }
        System.out.println("Factorial of " + n + " is = " + ans);
    }
}
