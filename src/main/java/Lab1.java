/*
C2 = 0
C3 = 2
C5 = 2
C7 = 1

O1 = +
C = 2
O2 = %
i & j - short
 */

public class Lab1 {
    public static void main(String[] args) {
        System.out.println(solver(1, 2, 3, 3));
    }

    static int solver(int a, int b, int n, int m) {
        if (a < 0 || b < 0 || n < 0 || m < 0)
            throw new IllegalStateException("Enter positive value(s)");

        int resultSum = 0;

        for (short i = (short) a; i <= n; i++) {
            for (short j = (short) b; j <= m; j++) {
                resultSum += (i % j)/(i + j);
            }
        }

        return resultSum;
    }
}
