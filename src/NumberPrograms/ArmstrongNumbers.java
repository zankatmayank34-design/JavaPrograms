import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Armstrong Numbers...");
        System.out.print("Enter a Number to check Armstrong Number: ");
        int n = s.nextInt();
        boolean isArmstrong = isArmstrong(n);
        if (isArmstrong) {
            System.out.println(n + " is an Armstrong number");
        }else  {
            System.out.println(n + " is not an Armstrong number");
        }
    }
    public static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;
        while (n>0){
            int digit = n % 10;
            sum = sum + ( digit * digit * digit );
            n = n / 10;
        }
        if (temp == sum){
            return true;
        }
        else{
            return false;
        }
    }
}
