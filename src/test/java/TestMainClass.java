import org.junit.Assert;
import org.junit.Test;

public class TestMainClass {
    private GeohashUDF udf = new GeohashUDF();

    @Test
    public void checkGeohasher() {
        Assert.assertEquals(
                "sp3m",
                udf.evaluate(41.66667, 2.0, 4));

        Assert.assertEquals(
                "zzzz",
                udf.evaluate(90.0, 180.0, 4));

        Assert.assertEquals(
                "0000",
                udf.evaluate(-90.0, -180.0, 4));

        Assert.assertEquals(
                "0",
                udf.evaluate(-90.0, -180.0, 1));

        Assert.assertEquals(
                "00000000000",
                udf.evaluate(-90.0, -180.0, 11));
    }

}