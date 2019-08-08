package wanzhuansuanfamianshi.DynamicPrograming;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
      /*  long fibonacci = System.currentTimeMillis();
            Fibonacci.fibonaciCalculate(42);
        System.out.println(System.currentTimeMillis() - fibonacci);

        System.out.println("=====================myfibonacci==================");
        long mufibonacci = System.currentTimeMillis();
        Fibonacci fibonacci1 = new Fibonacci(42);
        fibonacci1.myfibonacciCalculate(42);
        System.out.println(System.currentTimeMillis() - mufibonacci);


        System.out.println("===================compare============");
        System.out.println(Fibonacci.fibonaciCalculate(20));
        System.out.println(Fibonacci.fibThink(20));*/

        System.out.println("==================================clambStais Recursion=============================");
        System.out.println(ClambStairs.clambStairsRecursion(4));
        System.out.println("==================================clambStairs DunamicProgram=======================");
        System.out.println(ClambStairs.clambStairsDynamicProgram(4));
    }
}
