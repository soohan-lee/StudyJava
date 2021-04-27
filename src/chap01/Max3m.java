package chap01;
//3개의 정숫값 가운데 최댓값을 구하여 출력합니다.

public class Max3m {

    static int max3(int a, int b, int c) {
        int max = a;
        if (b>max)
            max = b;
        if (c>max)
            max = c;

        return max;
    }

    public static void main (String[] args) {
        System.out.println("max3(3,2,1) = " + max3(3,2,1));
        System.out.println("max3(4,5,6) = " + max3(4,5,6));
        System.out.println("max3(7,8,9) = " + max3(7,8,9));
        System.out.println("max3(7,8,9) = " + max3(1,2,3));
        System.out.println("max3(7,8,9) = " + max3(7,9,8));
        System.out.println("max3(7,8,9) = " + max3(6,5,7));
        System.out.println("max3(7,8,9) = " + max3(1,0,8));
        System.out.println("max3(7,8,9) = " + max3(7,1,9));
        System.out.println("max3(7,8,9) = " + max3(9,8,3));
        System.out.println("max3(7,8,9) = " + max3(1,3,4));
        System.out.println("max3(7,8,9) = " + max3(2,8,8));
        System.out.println("max3(7,8,9) = " + max3(9,9,9));
    }
}
