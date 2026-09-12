package JAVA_ARRAYS;
import java.util.*;
public class prac7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6};
        int rev[] = new int[arr.length];
        int j= 0;
        for (int i = (arr.length)-1;i>=0 ; i--){
            rev[j++] = arr[i];
        }
        System.out.println(Arrays.toString(rev));
    }
    
}
