package JAVA_ARRAYS;

import java.util.Arrays;

//In this we are reversing the array but by 2 pointer method because it is more optimized
public class prac8 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int i = 0 , j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = arr[temp]; 
            /*it is most efficient method because the work is done in N/2 
             steps where as in taking the copy of array method take N steps*/
            j--;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
