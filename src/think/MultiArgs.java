package think;

import java.io.FileInputStream;

public class MultiArgs {
    public static <T> T[] of(T... args){
        return args;
    }
    public static void main(String[] args) {
        Integer[] data = (Integer[]) of(1,2,3,3,4);

        /**
         * fileInputStream,JDBC等从1.7支持 try with resource
         * 其本质是，该这些类都实现了 closable 接口的close 方法，编译器或jvm会自动调用这些类的close方法
         */
        //FileInputStream
    }
}
