package xuexisuanfasixiang.sort;

public class MergeSort {
    public static void rescureSort(int[] arr,int l ,int r){ //l: lIndex   r:rIndex
        if(l == r){
            return;
        }

        int mid = (r - l) / 2 + l;
        rescureSort(arr, l, mid);
        rescureSort(arr, mid + 1, r);


       /* int[] store = new int[r - l + 1];
        int lIndex = l, rIndex = mid + 1;
        for(int i = 0; i < store.length; i++ ) {
            if(lIndex == mid + 1){
                while(rIndex <= r){
                    store[i++] =
                }
            }
            if(rIndex == )
            store[i] = arr[lIndex] < arr[rIndex] ? arr[lIndex++] : arr[rIndex++];
        }*/
       merge(arr, l, r, mid );
    }

    public static void merge(int[] arr, int l, int r, int mid){
        int lIndex = l;
        int[]  help = new int[r - l + 1 ];
        int p1 = l;
        int p2 = mid + 1;
        int i = 0;
        while(p1 <= mid && p2 <= r){
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while(p1 <= mid){
            help[i++] = arr[p1++];
        }
        while(p2 <= r){
            help[i++] = arr[p2++];
        }

        for(int j = 0; j < help.length; j++ ) {
            arr[l+ j] = help[j];
        }
    }



    public static void mergeSortBU(int[] arr ) {
        for(int size = 2; size < arr.length; size = size * 2 ) {
            int i = 0;
            for(  ;i + size <= arr.length; i = i + size ) {
                    int mid = (i + size / 2);
                    merge(arr, i, i+ size - 1, mid);

            }
            if(i + size >  arr.length ){
                int r = arr.length - 1;
                int l = i ;
                int mid = (i + size / 2) < (arr.length - 1) ?  (i + size / 2) : (arr.length - 1);
                merge(arr, l, r,  mid );
            }
        }

    }

    private static void sortForBU(int[] arr, int l, int r, int mid ) {
        int p1 = l;
        int p2 = mid + 1;
        int[] help = new int[r - l + 1];

    }
}
