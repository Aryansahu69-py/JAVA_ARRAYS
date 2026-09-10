package JAVA_ARRAYS;
import java.util.*;
public class prac4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements you want in array");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i = 0; i<(arr.length);i++){
            System.out.println("Enter the Element");
            int ele = sc.nextInt();
            arr[i] = ele;

        }
        System.out.println("Your Elements are -:");
        for(int j =0 ; j<(arr.length); j++){
            System.out.println(arr[j]);
        }

    }
    
}
