package xuexisuanfasixiang.sort;

public class QuickSort {
    public static void quickSort(int[] arr, int l, int r){
        if(l < r ) {
            int[] help = partition(arr,l,r);
            quickSort(arr, l, help[0] - 1);
            quickSort(arr, help[1] + 1, r);
        }
    }
    public static void randomQuickSort(int[] arr, int l, int r){
        if(l < r ) {
            int random = (int) (l + Math.random() * (r - l));
            swap(arr,r,random);
            int[] help = partition(arr,l,r);
            randomQuickSort(arr, l, help[0] - 1);
            randomQuickSort(arr, help[1] + 1, r);
        }
    }
    private static int[] partition(int[] arr, int l, int r){
        int more = r ;
        int less = l -1;
        while(l < more){
            if(arr[l] < arr[r]){
                swap(arr, ++less, l++);
            }else if (arr[l] > arr[r]){
                swap(arr, l, --more);
            } else{
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
