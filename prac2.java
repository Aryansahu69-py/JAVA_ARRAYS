package JAVA_ARRAYS;

//finding the prime number
import java.util.*;

public class prac2 {
    public static void prime(int n) {
        int count=0;
        
        for (int i = 2; i*i<=n; i++) { // here root n optimization is used so that less iteration is exerted
                int b = n%i;
                if (b==0){
                    count +=1;
                }
    
        }
        System.out.println(count==0 ? "Prime" : "Not a Prime");
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        prime(num);
    }

}
