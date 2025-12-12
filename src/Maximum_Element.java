import java.util.Scanner;

public class Maximum_Element {
    public static void main(String[] args) {
        int[] arr = {10,20,60,5,7};

        int max = arr[0];

        for (int i = 1; i< arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum number in the array is "+max);
    }
//tc =O(n)
    //SC = O(1)





}
