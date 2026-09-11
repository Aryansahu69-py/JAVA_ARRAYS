package JAVA_ARRAYS;

public class prac5 {
    public static void main(String arg[]){
        int [] arr = {1,2,5,3,7,4};
        int max= arr[0];
        for(int i = 1;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    
}
