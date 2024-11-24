public class HighestAltitude {
    public static int highestAlt(int[] gain) {
        int maxi=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            maxi=Math.max(maxi,sum);


        }
        return maxi;

    }
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(highestAlt(gain));
    }
}
