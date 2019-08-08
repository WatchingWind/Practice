package xuexisuanfasixiang.sort;

public class ShellSort {
    public static int[]  sort(int[] arr ) {
        int[] gaps = new int[]{5,3,1};
        for(int k = 0; k < gaps.length; k++ ) {
            int gap = gaps[k];
            for(int i = 0; i < arr.length; i++ ) {
                if(i + gap < arr.length && arr[i] > arr[i + gap] ) {
                    for(int j = i; j >= 0 && arr[j] > arr[j + gap]; j = j - gap ){
                        swap(arr, j, j + gap);
                    }
                }
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
