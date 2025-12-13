package Two_pointer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorted_Square_array {
    public static void main(String[] args) {
        int [] arr = {-6,8,7,0,2};
        int n = arr.length;
        //NOTE:
        //Two-pointer solution works ONLY when input array is already sorted.
        Arrays.sort(arr);
        int[] res_arr = new int[n];

        int i = 0, j = n-1, idx = n-1;

        while (i<=j){
            if (Math.abs(arr[i])>Math.abs(arr[j])){
                res_arr[idx--] = arr[i] * arr[i];
                i++;
            }
            else {
                res_arr[idx--]=arr[j] * arr[j];
                j--;
            }
        }
        for (int num : res_arr){
            System.out.print(num+" ");
        }
    }
}
