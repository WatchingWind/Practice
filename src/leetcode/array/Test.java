package leetcode.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
       /* Integer[] arr = (Integer[]) ArrayGenerator.getArray(1,2,3,4,4,4,4,5,5,6);
        int[] nums  = new int[]{1,3,3,4,5,5,5,6,7};
        RemoveDuplication.removeDuplicates(nums);
        for(int i = 0;i < nums.length;i++){
            System.out.println(nums[i]);
        }*/

       //最大子序和
       // System.out.println(MaxSubArray.maxSubArray(new int[]{1,2,3,-1,-1,-3,1,3}));

       /* System.out.println("=============================120_Triangle===========================");
        int[][] arr ={{2},{3,4},{6,5,7},{4,1,8,3}};
        //[[2],[3,4],[6,5,7],[4,1,8,3]]
        List<List<Integer>> list = new ArrayList<>();

        List list1 = new ArrayList();
        list1.add(2);

        List list2 = new ArrayList();
        list2.add(3);
        list2.add(4);

        List list3 = new ArrayList();
        list3.add(6);
        list3.add(5);
        list3.add(7);

        List list4 = new ArrayList();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);

        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);

        System.out.println(Triangle_120.minimumTotal(list));

        System.out.println(list.size());*/
      /*  System.out.println("==================================MiniPathSum================================");
        //int miniSum = MiniPathSum_64.miniPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}});
        int miniSum = MiniPathSum_64.miniPathSum(new int[][]{{7,2},{6,6},{8,7},{5,0},{6,0}});
        System.out.println(miniSum);*/

        System.out.println("============================HouseRobber========================================");
        int robGet = HouseRobber.rob(new int[]{226,174,214,16,218,48,153,131,128,17,157,142,88,43,37,157,43,221
                ,191,68,206,23,225,82,54,118,111,46,80,49,245,63,25,194,72,80,143,55,209,18,55,122,65,66
               });
        System.out.println(robGet);

        System.out.println(HouseRobber.dynamicCalculate(new int[]{226,174,214,16,218,48,153,131,128,17,157,142,88,43,37,157,43,221
                ,191,68,206,23,225,82,54,118,111,46,80,49,245,63,25,194,72,80,143,55,209,18,55,122,65,66
               }));

    }


}
