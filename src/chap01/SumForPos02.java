package chap01;

import java.util.Scanner;

public class SumForPos02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a;

        do {
            System.out.println("양의 정수를 입력하세요 : ");
            a= scanner.nextInt();
            if(a<=0) System.out.println("양의 정수가 아닙니다. 다시 입력하세요.");
        } while(a<=0);

        int count = Integer.toString(a).length();
        System.out.println("입력값의 자릿수는 " + count + "입니다.");
    }
}