public class ArrayMinMax {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int max = arr[0];
        int min = arr[0];
        int i = 1;
        while (i < arr.length){
           if (max < arr[i]) {
            max = arr[i];
           }
            if (min > arr[i]) {
                min = arr[i];
            }
            i++;
        }
        System.out.println("Max value is : " + max);
        System.out.println("Min value is : " + min);
    }
}
