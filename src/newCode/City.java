package newCode;

import java.util.Scanner;

public class City {
    public static void main(String[] args) {
        int y_u;
        int y_d ;
        int x_l ;
        int x_r;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();
        x_l = n3 >= n1 ? n1 : n3;
        x_r = n3 >= n1 ? n1 : n3;
        y_u = n2 >= n4 ? n2 : n4;
        y_d = n2 >= n4 ? n4 : n2;

        int i = 2;
        while(i < n) {
            n1 = in.nextInt();
            n2 = in.nextInt();

            if(n1 < x_l){
                x_l = n1;
            }
            if(n1 > x_r){
                x_r = n1;
            }

            if(n2 < y_d){
                y_d = n2;
            }

            if(n2 > y_u){
                y_u = n2;
            }
            i++;
        }

        int width = x_r - x_l;
        int height = y_u - y_d;
        if(width == height)
        System.out.println(width * width);
        else{
            int bigger = width > height ? width : height;
            System.out.println(bigger * bigger);
        }

        System.out.println(Integer.MAX_VALUE);
    }
}
