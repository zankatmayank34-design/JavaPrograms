import java.util.Scanner;

class SumOfOdd {
	public static void main(String args[]){

	Scanner s = new Scanner(System.in);
	System.out.println("\nWelcome to Odd Number Calculator");
	System.out.print("Enter Your Number Till Sum of Odd Numbers: ");
	int num = s.nextInt();

	int i = 1;
	int ans = 0;
	while (i <= num){
	ans = ans + i;
	i = i+2;
	}
	System.out.println("Sum of Your All Numbers Till " + num + " = " + ans);
	}
}
