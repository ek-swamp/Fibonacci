public class Fibonacci {
    public static int F(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n <= 1) {
            return n;
        }
        else {
            int sum = 1;
            int prev = 0;

            for (int i = 2; i <= n; i++) {
                int tmp = sum;
                sum += prev;
                prev = tmp;
            }

            return sum;
        }
    }
}
