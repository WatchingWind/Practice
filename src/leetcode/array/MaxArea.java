package leetcode.array;

public class MaxArea {
    public static int maxArea(int[] height) {
        int p = 0;
        int area = 0;
        for(int i = 0; i < height.length - 1; i++ ) {
            if(p != 0 && height[i] < height[p]) {
                continue;
            }

            if(calculateArea(height, i) > area){
                area = calculateArea(height,i);
                p = i;
            }
        }

        return area;
    }

    public static int calculateArea(int[] arr, int index){
        int  start = index;
        int end = index;
        int area;
        for(int i = index; i < arr.length; i++ ) {
            if(arr[i] >= arr[start]){
                end = i;
            }
            else if(arr[i] < arr[start]){
                boolean compare =  (i - start) * arr[i] >= (end - start) * Math.min(arr[end], arr[start])
                        ?  true : false;
                if(compare){
                    end = i;
                }
            }

        }


        area = (end - start) * Math.min(arr[start], arr[end]);
        return area;
    }

}
