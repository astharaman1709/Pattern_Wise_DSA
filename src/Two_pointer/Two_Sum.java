package Two_pointer;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int i = 0;
        int j = arr.length-1;
        int target = 6;
         while (i<j){
             int sum = arr[i]+arr[j];
             if (sum == target) {
                 System.out.println("Pair found: " + arr[i] + ", " + arr[j]);
                 return;
             }
             else if (sum < target) {
                 i++;  // move left pointer forward
             }
             else {
                 j--;  // move right pointer backward
             }

         }
        System.out.println("No pair found");
    }
}
