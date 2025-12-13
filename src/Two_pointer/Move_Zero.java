package Two_pointer;

public class Move_Zero {
    public static void main(String[] args) {
        int [] arr ={ 0, 0,6,0,77};

        int slow = 0;
        for (int fast = 0; fast< arr.length;fast++){
            if (arr[fast]!=0){
                int temp = arr[slow];
                arr[slow]=arr[fast];
                arr[fast] = temp;

                slow++;

            }

        }
        for (int num : arr){
            System.out.print(num+" ");
        }
    }
}
