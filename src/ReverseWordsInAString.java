import java.util.regex.Pattern;

public class ReverseWordsInAString {

    public static void main(String[] args) {
        String a = "  hello world  ";
        System.out.println(reverseWords(a));
    }

    public static String reverseWords(String s) {
        Pattern pattern = Pattern.compile("\\s+");
        String[] words = pattern.split(s);
        String result = "";
        for (int  i = 0 ; i < words.length ; i++) {
            if (i == words.length - 1) {
                result = words[i] + result;
            }
            else {
                result = " " + words[i] + result;
            }
        }
        return result.trim();
    }
}
