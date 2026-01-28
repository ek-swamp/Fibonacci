import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Calculate a number in the Fibonacci sequence");
            System.out.print("Input n: ");
            int n = Integer.parseInt(b.readLine());

            long start = System.nanoTime();
            int f = Fibonacci.F(n);
            long stop = System.nanoTime();

            System.out.printf("Fibonacci number is: %d\n", f);
            System.out.printf("Execution time was %d ns\n", stop - start);
            System.out.printf("or ~%.3f ms\n", (stop - start) / 1000000f);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}