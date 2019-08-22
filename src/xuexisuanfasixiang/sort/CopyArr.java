package xuexisuanfasixiang.sort;

public class CopyArr {
    public static int[] copyArr(int[] arr){
        int[] copy = new int[arr.length];
        for(int i = 0; i < arr.length; i++ ) {
            copy[i] = arr[i];
        }

        return copy;
    }
}
