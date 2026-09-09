package JAVA_ARRAYS;

public class funtion {
    public static int solve(){ // int shows which type of value should be return
        /*static is optional but if static is not given we have to make an object first 
        then we can use it
         
*/

        System.out.println("Hello World");
        int a=10 , b = 20 ;
        int sum=a+b;
        return sum;

    }
    public void print(){
        System.out.println("Hello");
    }


    public static void main(String[] args){
        int a =  solve();
        System.out.println(a);
        funtion sc =new funtion(); // Declaring the non static Function
        sc.print();
    }
}
