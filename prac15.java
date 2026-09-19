package JAVA_ARRAYS;
//learning the binary search
/*In this Search type we use log(n) steps but linear search takes n steps */
public class prac15 {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int ans = -1 ; 
        int target = 0 ; 
        int n = arr.length ; 
        int s = 0  , e = n-1 ; 
        while(s<=e){
            int m = (s+e)/2;
            if(arr[m] == target){
                ans = m ;
                break;
            }else if(arr[m] < target) {
                s = m+1;
            }else{
                e = m-1;
            }
        }
        System.out.println(ans);
    }
}
