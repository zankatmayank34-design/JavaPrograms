import java.util.Scanner;

public class ArrayOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter a Number to Find Occurrence :");
        int num = input.nextInt();
        int i = 0;
        int count = 0;
        while(i < arr.length){
            if(num == arr[i]){
                count =  count + 1;
            }
            i++;
        }
        System.out.println("The Occurrence of your number is " + count);
    }
}
