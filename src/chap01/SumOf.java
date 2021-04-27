package chap01;

import java.util.Scanner;

public class SumOf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("a의 값 : ");
        int a = scanner.nextInt();
        System.out.println("b의 값 : ");
        int b = scanner.nextInt();

        System.out.println(sumof(a,b));
    }
    static int sumof(int a, int b) {
        int sum = 0;
        if (a<b) {
            for ( ; a<=b ; a++) {
                sum +=a;
            }
        } else if (a>b) {
            for (;b<=a;b++) {
                sum +=b;
            }
        } else {
            sum = a;
        }
        return sum;
    }
}
