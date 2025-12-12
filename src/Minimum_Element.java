public class Minimum_Element {
    public static void main(String[] args) {
        int[] arr = {10,55,77,6,2};

        int min= arr[0];

        for (int i = 0; i< arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum element = "+min);
    }
}
