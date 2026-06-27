//Palindrome Numbers are integers that read the same forward and backward,
//means Number = Reverse Number
//    Exp : 24542,222,11,101,20302,98789

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Number...");
        System.out.print("Enter a Number: ");
        int n = s.nextInt();
        int rev = 0;
        int temp = n;
        while(n>0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        if (temp - rev == 0){
            System.out.println(temp + " is a Palindrome Number");
        }else {
            System.out.println(temp + " is a Not Palindrome Number");
        }
    }
}
