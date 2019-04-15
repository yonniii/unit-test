import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {

    @Test
    public void test_Add(){
        CustomCalculator cal = new CustomCalculator();
        int result = cal.add(3,4);
        assertTrue(result == 7);
    }

    @Test
    public void test_Sub(){
        CustomCalculator cal= new CustomCalculator();
        int result = cal.subtract(10,2);
        assertTrue(result ==8);
    }

}