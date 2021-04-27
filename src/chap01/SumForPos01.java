package chap01;

import java.util.Scanner;

public class SumForPos01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        System.out.println("b-a를 구합니다.");

        do{
            System.out.println("b의 값 :");
            b=scanner.nextInt();
            System.out.println("a의 값 : ");
            a=scanner.nextInt();
            if(b<=a){
                System.out.println("다시 입력하세요");
            }
        } while(b<=a);

        int minus = b-a;
        System.out.println("b-a : "+minus);
    }
}
