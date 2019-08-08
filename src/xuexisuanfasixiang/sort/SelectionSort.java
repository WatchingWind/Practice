package xuexisuanfasixiang.sort;

public class SelectionSort {
    public static int[] sort(int[] arr ) {
        for(int i = 0; i < arr.length; i++ ) {
            int index = 0;
            for(int j = 0; j < arr.length - i - 1; j++ ) {
                if(arr[index] < arr[j]){
                   index = j;
                }
            }

            if(arr[index] > arr[arr.length - i - 1]){
                compare(arr, index, arr.length - i - 1);
            }
        }

        return arr;
    }

    private static void compare(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
