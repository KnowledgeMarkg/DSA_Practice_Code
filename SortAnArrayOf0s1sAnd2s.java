import java.util.Arrays;

public class SortAnArrayOf0s1sAnd2s {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 2, 1, 0, 1, 0, 2, 0, 1};

        int low =0;
        int high = arr.length-1;
        int mid =0;
        while (mid<=high) {
            if(arr[mid]==0){
               swap(arr,low, mid);
               low++;
               mid++;
            }else if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
            }else {
                mid++;
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
