package chap01;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no;

        System.out.println("2자리의 정수를 입력하세요");

        do {
            System.out.println("입력 : ");
            no = scanner.nextInt();
        } while(no<10 || no>99);

        System.out.println("no는 " +no+ " 입니다.");
    }
}
