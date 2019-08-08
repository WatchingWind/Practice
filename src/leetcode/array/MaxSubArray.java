package leetcode.array;

public class MaxSubArray {
    /*public static int maxSubArray(int[] nums) {

        //0 ,1,2,-1,3
        int ans = nums[0];
        int sum = 0;
        for(int num: nums) {
            if(sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }*/

    public static int myMaxSubArray(int[] nums){
        int ans = nums[0];
        int num = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] > 0){
                num = num + i;
            }

        }

        return ans;
    }
}
