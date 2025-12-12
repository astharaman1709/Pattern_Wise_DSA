package Two_pointer;

public class Reverse_vowel {

    public static boolean isVowel(char ch){
        return "AEIOUaeiou".indexOf(ch)!=-1;
    }
    public static void main(String[] args) {
        String str = "Anshuman";

        char[] ch = str.toCharArray();

        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            while (i < j && !isVowel(ch[i])) {
                i++;
            }
            while (i < j && !isVowel(ch[j])) {
                j--;
            }
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        System.out.println(new String(ch));

    }
}
