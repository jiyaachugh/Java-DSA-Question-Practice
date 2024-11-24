import java.util.Arrays;

public class ExtraCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(greatCandy(candies, extraCandies));
    }

    public static String greatCandy(int[] candies,int extraCandies) {
        String[] boolArr = new String[candies.length];
        int maxCandies = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= maxCandies) {
                boolArr[i] = "true";
            } else {
                boolArr[i] = "false";
            }

        }
        return Arrays.toString(boolArr);
    }
}
