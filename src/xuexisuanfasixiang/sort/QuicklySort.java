package xuexisuanfasixiang.sort;

public class QuicklySort {
    public static void quicklySort(int[] arr, int l, int r){
        if(l < r ) {
            return;
        }

    }

    private static int[] partition(int[] arr, int l, int r){
        int more = r ;
        int less = l -1;
        while(l < more){
            if(arr[l] < arr[r]){
                swap(arr, ++less, l++);
            }else if (arr[l] > arr[r]){
                swap(arr, l++, --more);
            }
            else{
                l++;
            }
        }
        swap(arr,more, r);
        return new int[]{less + 1,more};
    }

    private static void swap(int[] arr,int n1, int n2 ) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}
