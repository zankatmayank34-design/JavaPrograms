import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Welcome to Reverse Digit Calculator...");
        System.out.print("Enter Your Digit To Reverse: ");
        int n = S.nextInt();
        int rev = 0;
        while (n != 0){
            int i = n % 10;
            rev = rev * 10 + i;
            n = n / 10;
        }
        System.out.println("REVERSE: " + rev);
    }
}
