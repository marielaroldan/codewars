package generatecolorrgb;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

public class GenerateColorRGBTest {
    @Test
    public void symbolTest() throws Exception {
        assertEquals("#", GenerateColorRGB.generateColor(new Random()).substring(0, 1));
    }
}