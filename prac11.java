package JAVA_ARRAYS;

import java.util.Arrays;

public class prac11 {
    public static void main(String[] args) {
        int k = 4;
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        for (int j = 1; j <= k; j++) {
            int temp = arr[0];
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                arr[i - 1] = arr[i];
            }
            arr[n - 1] = temp;
           
        }
         System.out.println(Arrays.toString(arr));
    }

}
