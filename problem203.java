package JAVA_ARRAYS;

import java.util.Arrays;

public class problem203 {
    /*we have to shift the zero at the end of the array while maintaing the order*/ 
    public static void main(String[] args) {
        int arr[] = {1,2,0,5,9,0,0,4,7};
        int n = arr.length;
        int copy[] = new int[n];
        int s = 0 , e = n-1;
        for(int i = 0 ; i<n ; i++){
            if(arr[i] != 0 ){
                copy[s++] = arr[i];  
            }else{
                copy[e--] = arr[i];
            }
        }
            arr = copy ; 
        System.out.println(Arrays.toString(arr));
    }
}
