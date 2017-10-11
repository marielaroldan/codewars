import org.junit.Test;

import static org.junit.Assert.*;

public class TwoToOneTest {

    @Test
    public void longest(){
        assertEquals("abcdefklmopqwxy", TwoToOne.longest("xyaabbbccccdefww","xxxxyyyyabklmopq" ));
        assertEquals("abcdefghijklmnopqrstuvwxyz" , TwoToOne.longest( "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz" ));
        assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));
        assertEquals("abcdefghilnoprstu", TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("acefghilmnoprstuy", TwoToOne.longest("inmanylanguages", "theresapairoffunctions"));

    }

}