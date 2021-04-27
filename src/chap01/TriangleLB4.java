package chap01;
import java.util.Scanner;

public class TriangleLB4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("숫자를 입력하세요 : ");
            n = scanner.nextInt();
        }while(n<=0);

        spira(n);
    }

    public static void spira(int n) {

        for(int i = n ; i>=1 ; i--){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(' ');
            }
            for( int k = 1 ; k<=((n-i)*2+1) ; k++){
                System.out.print(n-i+1);
            }
            System.out.println();
        }
    }
}
