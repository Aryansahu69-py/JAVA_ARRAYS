package JAVA_ARRAYS;
import java.util.*;
public class problem204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in celcius");
        double cel = sc.nextDouble();
        double kel = cel + 273.15;
        double feh = (cel*1.80) + 32.00;
        double ans[] = {kel , feh};
        System.out.println(Arrays.toString(ans));
    }
    
}
