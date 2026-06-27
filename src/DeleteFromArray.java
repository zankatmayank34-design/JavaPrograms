import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Arr = ArrayUtility.inputArray();
        System.out.print("Now, Enter a number you want to delete: ");
        int num = sc.nextInt();
        int[] newArr = deleteArray(Arr, num);
        System.out.println("Here is Your Array...");
        ArrayUtility.displayArray(newArr);

    }

    public static int[] deleteArray(int[] Arr, int num){
        int occ = ArrayUtility.Occurrence(Arr,num);
        if (occ == 0){
            ArrayUtility.displayArray(Arr);
        }
        int i = 0;
        int j = 0;
        int[] newArr = new int[Arr.length-occ];
        while(i < Arr.length){
            if (num != Arr[i]){
                newArr[j] = Arr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
