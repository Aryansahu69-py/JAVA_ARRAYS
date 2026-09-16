package JAVA_ARRAYS;
//learning the binary search
public class prac15 {
    public static void main(String[] args) {
        int arr[] = {1,5,3,8,9,7};
        int ans = -1 ; 
        int target = 9 ; 
        int n = arr.length ; 
        int s = 0  , e = n-1 ; 
        while(s<=e){
            int m = (s+e)/2;
            if(arr[m] == target){
                ans = m ;
            }else if(arr[m] < target) {
                s = m+1;
            }else{
                e = m-1;
            }
        }
        System.out.println(ans);
    }
}
