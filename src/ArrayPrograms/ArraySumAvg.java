public class ArraySumAvg {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        long sum = sum(arr);
        int avg = avg(arr);

        System.out.println("Sum of Array is: " + sum);
        System.out.println("Avg of Array is: " + avg);
    }

    public static long sum(int[] arr) {
        long sum = 0;
        int i =0;
       while (i < arr.length) {
           sum = sum + arr[i];
           i++;
       }
        return sum;
    }

    public static int avg(int[] arr) {
        long sum = sum(arr);
        return (int)(sum/arr.length);
    }
}

