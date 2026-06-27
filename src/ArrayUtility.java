import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter Element No " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }
        return arr;
    }

    public static void displayArray(int[] arr){
        int i = 0;
        while (i < arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
    }

    public static int Occurrence(int[] Arr, int num){
        int count = 0;
        int i = 0;
        while (i < Arr.length){
            if (num == Arr[i]){
                count++;
            }
            i++;
        }
        return count;
    }
}