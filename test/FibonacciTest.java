import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
 Denne fil indeholder nok test til at kunne implementere en Fibonacci-sekvens.

 På nuværende tidspunkt burde du kunne implementere en version der følger definitionen.

 Men der nu også muligt at omskrive beregningen til at være udført i en løkke, eller måske ligefrem at lave en version,
 hvor løkke fjernes og i stedet bruges et funktions-/metodekald.

 På 3. semester vil du lære at skrive Java-kode i funktionel stil, så dette vil blive en fjerde måde at skrive koden på.

 Dog vil testklassen nedenfor ikke skulle omskrives for at kunne test en vilkårlig udgave af de 4 måder at skrive koden
 på!
*/

/**
 * Testklasse for Fibonacci-talrække
 *
 * Definition af sekvens:
 *      F(0) = 0
 *      F(1) = 1
 *      F(n) = F(n-1) + F(n-2), n > 1
 *
 * Det vil sige, at en negativ værdi som input ikke har et resultat.
 */
public class FibonacciTest {
    @Test
    public void inputNulTest() {
        Assertions.assertEquals(0, Fibonacci.F(0));
    }

    @Test
    public void inputEnTest() {
        Assertions.assertEquals(1, Fibonacci.F(1));
    }

    @Test
    public void inputFireTest() {
        Assertions.assertEquals(3, Fibonacci.F(4));
    }

    @Test
    public void notDefinedFibonacciTest() {
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> Fibonacci.F(-1));
    }
}