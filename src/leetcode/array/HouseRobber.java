package leetcode.array;

public class HouseRobber {
    private static int[] memo;
    //Recursion algorithm is right
    public static int rob(int[] nums) {
        memo = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            memo[i] = -1;
        }

        int  total = calculate(nums,nums.length - 1);

        return Math.max(memo[memo.length - 2],memo[memo.length - 1]);
    }

    public static  int calculate(int[] nums,int n){
       if( n == 1){
           return nums[1];
       }
       if(n == 0){
           return nums[0];
       }
       if(n < 0){
           return 0;
       }

       if(memo[n] != -1){
           return memo[n];
       }
      memo[n] =  nums[n] + Math.max(calculate(nums, n - 2),calculate(nums, n - 3));

       return memo[n];
    }

    //Recursion
    public static int dynamicCalculate(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[1];
        }
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }

        int[] temp = new int[nums.length];
        temp[0] = nums[0];
        temp[1] = nums[1];
        temp[2] = nums[2] + nums[0];
        //4,1,2,7,5,3,1
        for(int i = 3;i < nums.length;i++){
            temp[i] = nums[i] + Math.max(temp[i - 2] ,temp[i - 3]);
        }
        return Math.max(temp[temp.length - 1],temp[temp.length - 2]);
    }
}
