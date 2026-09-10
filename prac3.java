package JAVA_ARRAYS;
import java.util.*;
public class prac3 {
    public static void fact(int n ){
        System.out.println("The Factors are -:");
        for(int i = 2 ;  i <= n ;i++ ){
            if(n%i == 0){
                
                System.out.print(i + ",");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Which you want the factor");
        int num = sc.nextInt();
        fact(num);
    }
}
