package JAVA_ARRAYS;

public class prac13 {
    /* This is Subarray problem in which we are gonna findout  the target sum in the 
    sub arrays */ 
    public static void main(String[] args) {
        int arr[]={1,2,3,7,5};
        int n = arr.length;
        int target =12;
        int c = 0;
        for(int i = 0 ; i<n;i++){
            int sum = 0 ;
            for(int j = i ; j<n;j++){
                sum += arr[j];
                if(sum == target) c++;
            }
        }
        System.out.println(c);
    }
    
}
