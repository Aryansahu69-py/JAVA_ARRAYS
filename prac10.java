package JAVA_ARRAYS; //Left rotate by one

import java.util.Arrays;

public class prac10 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int temp = arr[0];
        for(int i = 1 ; i<arr.length;i++){
            arr[i - 1] = arr[i] ;
        }
        arr[arr.length-1] = temp ;
        System.out.println(Arrays.toString(arr));
    }
}
