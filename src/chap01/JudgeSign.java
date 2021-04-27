package chap01;

import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
        int n = scanner.nextInt();

//        if(n>0)
//            System.out.println("입력하신 수는 양수 입니다.");
//        else if(n<0)
//            System.out.println("입력하신 수는 음수 입니다.");
//        else {
//           System.out.println("입력하신 수는 0 입니다.");
//        }
        if( n == 1 ) {
            System.out.println("이 수는 1 입니다.");
        } else if ( n == 2 ) {
            System.out.println("이 수는 2 입니다.");
        } else if ( n == 3 ) {
            System.out.println("이 수는 3 입니다.");
        } else
            ;
    }
}
