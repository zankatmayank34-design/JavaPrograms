import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class LCM {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Welcome to Least Common Multiple Calculator...");
        System.out.print("Enter First Number: ");
        int num1 = S.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = S.nextInt();
        int i = max(num1,num2);

        while (true){
            if (i % num1 == 0 && i % num2 == 0){
                System.out.println("LCM: " + i);
                break;
            }
            i++;
        }
    }
}
