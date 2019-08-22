package xuexisuanfasixiang.sort;

public class GenerateArray {
    public static int[] getArray(int n ) {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * n);
        }
        return arr;
    }

    public static int[] getAlmostSortedArr(int n,int swap) {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++ ) {
            arr[i] = i;
        }
        for(int j = 0; j < swap; j++ ) {
            int r1 = (int) Math.random() * arr.length;
            int r2 = (int) Math.random() * arr.length;
            swap(arr, r1, r2);
        }
        return arr;
    }
    public static boolean isSorted(int[] arr){
        for(int i = 0; i < arr.length - 1; i++ ) {
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }

    private static void swap(int[] arr,int n1, int n2 ) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}
