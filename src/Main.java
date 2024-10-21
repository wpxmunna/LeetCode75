public class Main {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        System.out.println(marge(a,b));
    }

    public static String marge(String a, String b) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < a.length()||i<b.length(); i++) {
            if (i<a.length())
            sb.append(a.charAt(i));
            if (i<b.length())
            sb.append(b.charAt(i));
        }
        return sb.toString();
    }
}