package wanzhuansuanfamianshi.DynamicPrograming;

public class ClambStairs {

    public static int clambStairsRecursion(int stairNumber){
        if(stairNumber == 2){
            return 2;
        }
        if(stairNumber == 1){
            return 1;
        }

        return clambStairsRecursion(stairNumber - 1) + clambStairsRecursion(stairNumber -2);
    }

    public static int clambStairsDynamicProgram(int n){
        if(n < 1){
            throw new RuntimeException("n应该不小于1");
        }
        if(n == 1){
            return 1;
        }
        if ((n == 2)) {
            return 2;
        }

        int curStairs_2 = 1;//当前楼梯前的第二个可选择的数
        int curStairs_1 = 2;//当前楼梯前的第一个可选择的数
        int temp = 0;
        for(int i = 3;i < n;i++){
            temp = curStairs_1 + curStairs_2;
            curStairs_2 = curStairs_1;
            curStairs_1 = temp;
        }
    return curStairs_1 + curStairs_2;
    }

}
