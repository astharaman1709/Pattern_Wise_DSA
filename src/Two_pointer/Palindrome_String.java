package Two_pointer;

public class Palindrome_String {
    public static void main(String[] args) {
        String Str= "Madam";

        int i = 0;
        int j = Str.length()-1;

        while (i<j){
            if (Str.charAt(i)!=Str.charAt(j)){
                System.out.println("Not a Palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}
