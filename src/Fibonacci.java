public class Fibonacci {
    public static int F(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n <= 1) {
            return n;
        }
        else {
            return F(n - 1) + F(n - 2);
        }
    }
}
