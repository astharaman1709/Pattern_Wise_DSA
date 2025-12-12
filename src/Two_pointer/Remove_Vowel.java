package Two_pointer;

public class Remove_Vowel {
    public static void main(String[] args) {
        String str = "Icecream";

        String no_vowel_string = "";

        for (int i = 0;i<str.length(); i++){
//            char ch = str.charAt(i);
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
                no_vowel_string += str.charAt(i);
            }
//            if (ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U'&&ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'){
//                no_vowel_string+=ch;
//            }
        }
        System.out.println(no_vowel_string);
    }
}
