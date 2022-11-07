import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class EvenOrOddTest {
    @Test
    public void testEvenOrOdd() {
        EvenOrOdd eoo = new EvenOrOdd();
        assertEquals("Even", eoo.even_or_odd(6));
        assertEquals("Odd", eoo.even_or_odd(7));
        assertEquals("Even", eoo.even_or_odd(0));
        assertEquals("Odd", eoo.even_or_odd(8273));
        assertEquals("Odd", eoo.even_or_odd(-35));
    }

    private int randint(int min, int max){
        return min + (int)(Math.random() * (max - min));
    }

    @Test
    public void randomTests(){
        EvenOrOdd eoo = new EvenOrOdd();
        int n = randint(-10000, 100000);
        String sol = n % 2 == 0 ? "Even" : "Odd";
        for(int i = 0; i < 100; i++){
            assertEquals(sol, eoo.even_or_odd(n));
        }
    }

}