import java.util.Scanner;
 
class MultiplicationTable 
{   
    public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("welcome to Multiplication Table.....");
		System.out.print("Enter Your Num: ");
		int num = s.nextInt();
		MultiplicationTable(num);
	}
	public static void MultiplicationTable(int num) {
		int i = 1;
		while (i <= 10) {
			int ans = num * i;
			System.out.println(num + " * " + i + " = " + ans);
			i++;
		}
	}

} 