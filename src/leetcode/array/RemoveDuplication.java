package leetcode.array;

public class RemoveDuplication {

    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        if(nums.length == 1){
            return 1;
        }

        int index = 0;
        for(int i = 0;i < nums.length;i++){

            //这里 直接使用 i < nums.length特别值得思考
            //思考，如何避免数组越界，这是很重要的，注意下标最后是否越界
            if(i < nums.length - 1 && nums[i] == nums[i+1] ){
                continue;
            }
            nums[index++] = nums[i];
        }
        return index;
    }
}
