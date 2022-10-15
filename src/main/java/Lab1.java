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
        System.out.println(solver(-1, 2, 5, 6));
    }

    static double solver(int a, int b, int n, int m) {
        if (n < a || m < b)
            throw new IllegalStateException();

        double resultSum = 0;

        for (short i = (short) a; i <= n; i++) {
            for (short j = (short) b; j <= m; j++) {
                if (i + j == 0)
                    throw new IllegalStateException("Dividing by 0");
                resultSum += (double) (i - j) / (i + j);
            }
        }

        return resultSum;
    }
}