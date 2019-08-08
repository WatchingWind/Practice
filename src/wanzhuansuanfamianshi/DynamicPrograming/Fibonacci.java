package wanzhuansuanfamianshi.DynamicPrograming;

import java.util.Vector;

public class Fibonacci {
    public  int[] memo;

    public  Fibonacci(int n){
        memo = new int[n + 1];
        for(int i = 0;i < n;i++){
            memo[i] = -1;
        }
    }

    public static int fibonaciCalculate(int n){
        if(n == 1){
            return 1;
        }
        if(n == 0){
            return 0;
        }

        return fibonaciCalculate(n - 1) + fibonaciCalculate(n -2);
    }

    public int myfibonacciCalculate(int n){
        if(n == 1){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        if(memo[n] == -1){
            memo[n] = myfibonacciCalculate(n - 1) + myfibonacciCalculate(n - 2);
        }
        return memo[n];
    }

    /**
     * 自下而上的思考问题
     */
    public static int fibThink(int n){
        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;
        for(int i = 2;i <= n;i++){
            memo[i] = memo[i - 1] + memo[i -2];
        }
        return memo[n];
    }


}
