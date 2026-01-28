public class Fibonacci {
    public static int F(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        else {
            return F_(n, 1, 0);
        }
    }

    private static int F_(int n, int prev, int sum) {
        if (n == 0) {
            return sum;
        }
        else {
            return F_(n - 1, sum, sum + prev  );
        }
    }
}
