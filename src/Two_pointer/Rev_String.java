package Two_pointer;

public class Rev_String {
    public static void main(String[] args) {
        String str = "Hello";

        char[] ch = str.toCharArray();

        int i = 0;
        int j = str.length()-1;

        while (i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;

        }
        String rev = new String(ch);
        System.out.println(rev);
    }
}
