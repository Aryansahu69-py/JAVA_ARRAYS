package JAVA_ARRAYS;
/*Learning linear Search */
public class prac14 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 8, 4, 9};
        int target = 8;
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}
