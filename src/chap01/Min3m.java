package chap01;

public class Min3m {
    static int min3(int a, int b, int c) {
        int min = a;
        if (b<min)
            min = b;
        if (c<min)
            min = c;
        return min;
    }
    public static void main (String[] args) {
        System.out.println("min3(4,1,3) = " + min3(4,1,3));
    }
}
