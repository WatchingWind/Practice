package xuexisuanfasixiang.sort;

public class BubbleSort{
    public static int[] sort(int[] arr){
        for(int j = arr.length - 1; j >= 1; j-- ) {
            for(int i = 1; i <= j; i++) {

                if(arr[i] < arr[i-1]) {
                    compare(arr, i, i-1);
                }
            }

        }
        return arr;
    }

    public static int[] bestSort(int[] arr ) {
        for(int i = arr.length; i > 0; i-- ) {
            for(int j = 0; j < i - 1; j++ ) {
                if(arr[j] > arr[j + 1]){
                    compare(arr,j, j + 1);
                }
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
