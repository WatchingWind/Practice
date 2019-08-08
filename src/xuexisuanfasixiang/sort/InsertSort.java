package xuexisuanfasixiang.sort;

public class InsertSort {
    public static int[] sort(int[] arr ) {
        if(arr == null){
            return null;
        }
        if(arr.length <= 1){
            return arr;
        }

        for(int i = 1; i < arr.length; i++ ) {
            int temp = arr[i];//改进
            if(arr[i] < arr[i - 1]){
               int j;
               for(j = i; j > 0 && temp < arr[j - 1]; j -- ){
                   arr[j] = arr[j - 1];
                 //  swap(arr, j, j - 1 );//改进如上
               }
               arr[j] = temp;
            }
        }

        return arr;
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
