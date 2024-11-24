public class SearchInSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int k = 6;
        System.out.println(searchInSorted(arr,k));
    }

    public static boolean searchInSorted(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == k){
                return true;
            }
        }
        return false;
    }
}
