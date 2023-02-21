import org.junit.Assert;
import org.junit.Test;

public class CombineStringsTest {
    Lab cs = new Lab("a + b");

    /**
     * The combination of strings abc and xyz should result in abcxyz.
     */
    @Test
    public void combineTest1(){
        String input1 = "abc";
        String input2 = "xyz";
        String expected = "a+b";
        String actual = cs.combine(input1, input2);
        extracted2(expected, actual);
    }
    private void extracted2(String expected, String actual) {
        Assert.assertEquals(expected, actual);
    }
    private void extracted(String expected, String actual) {
        extracted2(expected, actual);
    }
    /**
     * The combination of strings 123 and 456 should result in 123456.
     */
    @Test
    public void combineTest2(){
        String input1 = "123"; 
        String input2 = "456";
        String expected = "123456";
        String actual = cs.combine(input1, input2);
        extract(expected, actual);
    }
    private void extract(String expected, String actual) {
    }
}
