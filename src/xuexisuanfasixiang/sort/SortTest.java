package xuexisuanfasixiang.sort;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class SortTest {
    public static void main(String[] args) {
       /* ArrayList a;
        int n = 10000;
         int[] genetateArr = GenerateArray.getArray(n);
        int[] copy = new int[n];
        for(int i = 0; i < n; i++ ) {
             copy[i] = genetateArr[i];
         }

        long cur = System.currentTimeMillis();
        int[] arr = BubbleSort.sort(genetateArr);
        System.out.println(System.currentTimeMillis() - cur);*/
        //System.out.println(GenerateArray.isSorted(arr));
/*
        int[] genetateArray = GenerateArray.getArray(20);
        for (int i: genetateArray
             ) {
            System.out.print(i + " ");
        }
        System.out.println(Math.random());
        System.out.println();
        int[] beatArr = BubbleSort.bestSort(GenerateArray.getArray(20));
        for(int i = 0; i < beatArr.length; i++){
            System.out.print(beatArr[i] + " ");
        }
        System.out.println();*/

     /*   int[] selectionarr = SelectionSort.sort(new int[]{1,5,7,9,2,8,6,4,4});
        for(int i = 0; i < selectionarr.length; i++){
            System.out.print(selectionarr[i] + " ");
        }
        System.out.println();*/

        /*System.out.println("====================================InsertSort=============================");
        int[] genArr = GenerateArray.getArray(20);
        int[] insertArr = InsertSort.sort(genArr);
        for (int i: insertArr
             ) {
            System.out.print(i + " " );
        }
        System.out.println();*/

       /* System.out.println("=================== Shell Sort=================================");
        int[] shellArr = ShellSort.sort(GenerateArray.getArray(20));
        for (int i: shellArr
        ) {
            System.out.print(i + " " );
        }*/

      /*  System.out.println("=========================Merge Sort=================================");
        //int[]  mergeArr = GenerateArray.getArray(50000);
        long mergeSort = System.currentTimeMillis();
          MergeSort.rescureSort(copy,0,n - 1);
        System.out.println(System.currentTimeMillis() - mergeSort);
*/

       /* System.out.println("================== MergeSortBU===================================");
        int[] mergeSortBu = GenerateArray.getArray(20);
        MergeSort.mergeSortBU(mergeSortBu);
        for (int i: mergeSortBu
        ) {
            System.out.print(i + " " );
        }*/

        System.out.println("======================quickSort============================");
        int[] quickSort = GenerateArray.getAlmostSortedArr(2000,200);
        int[] copyArr = CopyArr.copyArr(quickSort);

        long quickSortStart = System.currentTimeMillis();
        QuickSort.quickSort(quickSort, 0, quickSort.length - 1);
        System.out.println(System.currentTimeMillis() - quickSortStart);

        long randomQuickSort = System.currentTimeMillis();
        QuickSort.randomQuickSort(copyArr,0,copyArr.length - 1);
        System.out.println(System.currentTimeMillis() - randomQuickSort);

        System.out.println(CompareArr.compareArr(quickSort,copyArr));

       /* for (int i: quickSort
        ) {
            System.out.print(i + " " );
        }*/
    }
}
