package JAVA_ARRAYS;
/*Learning lineary Search */
public class prac14 {
    int arr[] = {1,2,5,3,8,4,9};
    int target = 8;
    int ans = -1 ; 
    for (int i = 0 ; i < arr.length ; i++){
        if(arr[i] == target) {
            ans = i;
            break;
        }
        
    }
    
}
