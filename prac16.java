package JAVA_ARRAYS;

import java.util.Arrays;

/*Sorting algo for unstable array ie bubble sort
 */
public class prac16 {
    public static void main(String[] args) {
        int arr[] = { 6, 3, 5, 2, 8, 4 };
        int n = arr.length;
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - 1 -i; i++) { //here n-1-i for reducing the steps as previous element is already sorted
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
