package JAVA_ARRAYS;

public class prac6 {
    public static void main(String[] args) {
        int []arr={1,6,3,9,8,4};
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                secmax=max;
                max=arr[i];
            }else if (arr[i]>secmax){
                secmax=arr[i];
            }
            
        }
        System.out.println(secmax);
    }
    
}
