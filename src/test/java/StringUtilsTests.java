import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTests {
    @Test
    public void testIsEmpty() {
        Assertions.assertFalse(StringUtils.isEmpty("TEST"));
        Assertions.assertTrue(StringUtils.isEmpty(""));
    }

    @Test
    public void testToDouble() {
        Assertions.assertEquals(3.1415, StringUtils.toDouble("3.1415"), 0.0001);
        Assertions.assertEquals(Double.NaN, StringUtils.toDouble(null), 0.00001);
    }

    @Test
    public void testFromDouble() {
        double source = 3.1415;
        String expected="3.1415";
        String actual = StringUtils.fromDouble(source);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testYear(){
        System.out.println("Test subtraction");
        int year = 1999;
        String expected = "Год не является високосным.";
        String result = StringUtils.year1(year);
        Assertions.assertEquals(expected, result);
    }
}
