package JAVA_ARRAYS;

import java.util.Arrays;

public class prac12 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int k = 3;
        
        for(int j = 1 ; j <= k ; j++){
            int temp =  arr[n-1];
            for(int i = n-1 ; i>=1 ; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp ;
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
