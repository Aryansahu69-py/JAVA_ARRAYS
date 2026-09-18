package JAVA_ARRAYS;

import java.util.Arrays;

//Learning selection sort
public class prac17 {
    public static void main(String[] args) {
        int arr[] = {2,6,8,7,4,10,5};
        int n = arr.length;
        for(int i = 0 ; i<n-1 ; i++){
            int min = i;
            for(int j = i+1 ; j<n ; j++){
                if (arr[j] < arr[min]){
                    min = j ;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min]=temp;
        }
        System.out.println(Arrays.toString(arr));
        
    }
}
