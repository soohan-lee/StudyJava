package chap01;

import java.util.Scanner;

public class Median3 {

    static int med3(int a, int b, int c) {
        if((b>=a && c<=a) || (b<=a && c>=a))
            return a;
        else if((a>b && c<b) || (b<a && c>b))
            return b;
        return c;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("a의 값 : ");
        int a = stdIn.nextInt();
        System.out.println("b의 값 : ");
        int b = stdIn.nextInt();
        System.out.println("c의 값 : ");
        int c = stdIn.nextInt();

        System.out.println("중앙값은 : " + med3(a,b,c));
    }
}
