import java.util.Arrays;

public class CheckArraySorting {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        boolean increasingOrder = increasingOrder(arr);
        boolean decreasingOrder = decreasingOrder(arr);
        if(increasingOrder || decreasingOrder){
            System.out.println("Your Array is sorted");
        }
        else {
            System.out.println("Your Array is not sorted");
        }
    }

    public static boolean increasingOrder(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean decreasingOrder(int[] arr) {
        int i = 1;
        while (i < arr.length) {
                if (arr[i] > arr[i-1]) {
                    return false;
                }
                i++;
            }
        return true;
    }
}
