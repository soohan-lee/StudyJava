package chap01;

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n 까지의 합을 구합니다.");
        System.out.println("n 의 값 : ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        for (int j = 1 ; j <=n ; j++) {
            if (j<n) {
                System.out.print(j + "+");
            } else if (j==n) {
                System.out.print(j+"="+sum);
            }
        }
        System.out.println("");
        System.out.println("1부터 " +n+" 까지의 합 : "+sum);
    }
}
