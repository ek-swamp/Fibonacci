public class Fibonacci {
    public static int F(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        else {
            int sum = 0;
            int prev = 1;

            for (int i = 1; i <= n; i++) {
                int tmp = sum;
                sum += prev;
                prev = tmp;
            }

            return sum;
        }
    }
}
