package xuexisuanfasixiang.sort;

public class GenerateArray {
    public static int[] getArray(int n ) {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * n);
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
}
