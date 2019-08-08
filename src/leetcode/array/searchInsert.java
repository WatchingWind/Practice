package leetcode.array;

public class searchInsert {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        for(int i = 0;i < nums.length;i++){
            if(target == nums[i]){
                return i;
            }
            if(target < nums[i]){
                return i - 1;
            }
        }

        return -1;
    }
}
