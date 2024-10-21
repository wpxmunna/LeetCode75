public class CommonMatch {
    public static void main(String[] args) {
        String a = "LEET";
        String b = "CODE";

        System.out.println(commonMatch(a, b));
    }
    public static String commonMatch(String a, String b) {

        if (!(a+b).equals(b+a)) {
            return "";
        }
        int gcdLength = gcd(a.length(),b.length());
        return a.substring(0,gcdLength);
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
