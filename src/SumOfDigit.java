import java.util.Scanner;

class SumOfDigit {
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Sum Of Digit Calculator");
		System.out.print("enter your num: ");
		int n = s.nextInt();

		int ans = 0;
		while(n != 0){
			int j = n % 10;
			ans = ans + j;
			n = n / 10;
		}
		System.out.println(ans);


	}
}
