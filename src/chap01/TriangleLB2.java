package chap01;

import java.util.Scanner;

public class TriangleLB2 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.println("몇단 삼각형 입니까?");
            n = scanner.nextInt();
        } while(n<=0);
        triangleRB(n);

    }
    public static void triangleLB(int n){


        for (int i = 1 ; i<=n ; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void triangleLU(int n){

        for(int i =n ; i>=1 ; i--){
            for(int j = 1 ; j<=i ; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void triangleRU(int n) {

        for (int i = 0 ; i<=n ; i++) {
            for(int j = 0 ; j<=i ; j++) {
                System.out.print(' ');
            }
            for (int k =1 ; k<=n-i ; k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void triangleRB(int n){

        for (int i =0 ; i<=n ; i++){
            for (int j = 0 ; j<=n-i ; j++){
                System.out.print(' ');
            }
            for (int k= 1 ; k<=i ; k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

}
