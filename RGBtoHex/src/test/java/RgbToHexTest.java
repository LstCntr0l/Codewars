
import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RgbToHexTest {

    @Test
    public void basicTests() {
        assertEquals( "000000", RgbToHex.rgb(0, 0, 0));
        assertEquals("010203", RgbToHex.rgb(1, 2, 3));
        assertEquals( "FFFFFF", RgbToHex.rgb(255, 255, 255));
        assertEquals( "FEFDFC", RgbToHex.rgb(254, 253, 252));
        assertEquals("00FF7D", RgbToHex.rgb(-20, 275, 125));
    }

    @Test
    public void randomTests() {
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int randomR = random.nextInt(455) - 100;
            int randomG = random.nextInt(455) - 100;
            int randomB = random.nextInt(455) - 100;

            String toHexRandomR = toHex(randomR);
            String toHexRandomG = toHex(randomG);
            String toHexRandomB = toHex(randomB);

            assertEquals( toHexRandomR + toHexRandomG + toHexRandomB, RgbToHex.rgb(randomR, randomG, randomB));
        }
    }

    private static String toHex(int c) {
        if (c < 0) c = 0;
        if (c > 255) c = 255;

        String cHex = Integer.toHexString(c);
        if (cHex.length() == 1) {
            cHex = "0" + cHex;
        }

        return cHex.toUpperCase();
    }
}