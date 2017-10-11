import static org.junit.Assert.*;

public class NthSeriesTest {
    @org.junit.Test
    public void seriesSum() throws Exception {
        assertEquals(NthSeries.seriesSum(2), "1,25");
        assertEquals(NthSeries.seriesSum(5), "1,57");
        assertEquals(NthSeries.seriesSum(9), "1,77");
        assertEquals(NthSeries.seriesSum(15), "1,94");
    }

}