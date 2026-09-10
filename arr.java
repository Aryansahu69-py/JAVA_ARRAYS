package JAVA_ARRAYS;

public class arr {
    public static  void main(String[] args){
        int arr[]; //  this is array Declaration
        int []arr1 = new int[]{1,2,3,4,5}; // in this case size  should not be given
        int [] arr2 =  {1,2,3,4,5};
        System.out.println(arr1); //This will give the memory location
        // for printing the the elements we use loop
        for(int i=0;  i<=(arr2.length -1); i++){
            System.out.println(arr2[i]);
        }
    }
    
}
