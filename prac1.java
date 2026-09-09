package JAVA_ARRAYS; //Finding the strong number but this using and Declaring our own function
public class prac1 {
    public static int fact(int num){
        int temp=1;
        for(int i=1;i<=num;i++){
            temp *= i;
            
        }
        return temp;
    }
    public static void main(String[] args){
        int n= 145;
        int temp = n;
        int sum=0;
        while(n>0){
            int a= n %10;
            sum +=fact(a);
            n /=10;
            }
            System.out.println(sum);
            System.out.println(sum == temp ? "Strong Number" :"Not a Strong Number");
    }
    
}
