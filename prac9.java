package JAVA_ARRAYS;

import java.util.Arrays;

public class prac9 {
    public static void main(String arg[]){
        int arr[] ={1,2,3,4,5,6} ;
        int n = arr.length ; 
        int temp = arr[n-1];
        for(int i = n-1 ; i>=1 ; i--){
             arr[i] = arr[i-1];

        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
    
}
