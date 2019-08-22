package leetcode.array;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        if(nums.length == 2){
            return new int[]{nums[1],nums[0]};
        }

        int[] results = new int[nums.length];

        int Lresult = 1;
        int time = 0;
        int index = 0;

        for(int i = 0; i < nums.length; i++ ) {
            if(nums[i] == 0 ) {
                results[i] = 0;
                Lresult = 1;
                index = i;
                time ++;
            }else {
                results[i] = Lresult * nums[i];
                Lresult = results[i];
            }
        }

        if(time == 1) {
            int lNum;
            int rNum;
            int temp;
            if(index - 1 < 0){
                lNum = 1;
                rNum = results[nums.length - 1];
            }
            else if(index + 1 > results.length - 1 ) {
                lNum = results[index - 1];
                rNum = 1;
            }else {
                lNum = results[index - 1];
                rNum = results[index + 1];
            }
            temp = lNum * rNum;
            for(int i = 0;i < nums.length; i++ ) {
                results[i] = 0;
            }
            results[index] = temp;

            return results;
        }
        if(time > 1){
            for(int i = 0;i < nums.length; i++ ) {
                results[i] = 0;
            }
            return results;
        }

        results[results.length - 1] = results[results.length - 2];

        int Rresult = nums[nums.length - 1];
        System.out.println(Rresult);
        for(int i = nums.length - 2; i > 0; i-- ) {
            results[i] = results[i - 1] * Rresult;
            System.out.println("Result " + Rresult);
            Rresult = Rresult * nums[i];
        }
        results[0] = Rresult;

        return  results;
    }
}
