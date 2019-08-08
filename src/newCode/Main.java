package newCode;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        while(i < n){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if (a > c || b > c) {
                System.out.printf("Case #%d: true",i+1);
            } else if (a < 0 && b < 0 && c >= 0) {
                System.out.printf("Case #%d: false",i+1);
            }
            else{
                int larger = a > b ? a : b;
                int smaller = a >= b ? b : a;
                if((c - larger) >= smaller){
                    System.out.printf("Case #%d: false",i+1);
                }else{
                    System.out.printf("Case #%d: true",i+1);
                }
            }
            i++;
        }
    }
}
