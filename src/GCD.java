import java.util.Scanner;

import static java.lang.Math.max;

public class GCD {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Welcome to Greatest Common Divisor Calculator...");
        System.out.print("Enter First Number: ");
        int num1 = S.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = S.nextInt();
        int j = max(num1,num2);
        while (j >= 1){
            if(num1 % j == 0 && num2 % j == 0){
                System.out.println("GCD: " + j);
                break;
            }
            j--;
        }
    }
}
