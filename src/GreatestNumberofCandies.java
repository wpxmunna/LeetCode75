import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestNumberofCandies {
    public static void main(String[] args) {
        int[] a = {2,3,5,1,3};
        int b = 3;

        System.out.println(kidsWithCandies(a,b));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies)>=max) {
                result.add(true);
            }
            else {
                result.add(false);
            }
        }
        return result;
    }
}
