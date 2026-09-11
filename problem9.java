 package JAVA_ARRAYS;
//This is a leetcode problem 9 
class problem9 {
    public static  boolean isPalindrome(int x) {
        
        
        int temp = x;
        int rev = 0;
        while(x>0){
            int lastdigit= x%10;
            rev = (rev*10) + lastdigit;
            x /=10;
        }
        if(rev == temp){
            return true;
        }  
        else{
            return false;
        }
    }
    public static void main(String arg[]){
        System.out.println(isPalindrome(121));
    }
}
