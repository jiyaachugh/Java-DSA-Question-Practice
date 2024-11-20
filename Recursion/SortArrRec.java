public class SortArrRec {
    public static void main(String[] args) {
        int[] arr = {12,13,14,16,15};
        int n = arr.length;
        System.out.println(arrSortOrNot(arr,n));
    }

    public static boolean arrSortOrNot(int[] arr, int n) {
        if(n == 1 || n == 0){
            return true;
        }
        return arr[n - 1] >= arr[n - 2]
                && arrSortOrNot(arr, n - 1);
    }
}
