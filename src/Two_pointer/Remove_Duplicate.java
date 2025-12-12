package Two_pointer;

public class Remove_Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,7};

        int i = 0;
        for (int j = 1;j< arr.length;j++){
            if (arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        System.out.println("Unique count: " + (i + 1));
        System.out.print("Modified array: ");
        for (int n = 0; n <= i; n++) {
            System.out.print(arr[n] + " ");
        }
    }
}
