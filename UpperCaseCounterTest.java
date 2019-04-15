import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseCounterTest {

    private UpperCaseCounter upperCaseCounter = new UpperCaseCounter();

    @Test
    public void nullCheck(){
        String str = null;

        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertTrue(result == 0);
    }

    @Test
    public void check_Blank(){
        String str ="";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);

        assertTrue(result==0);
    }

    @Test
    public void 대문자_ABC(){
        String str = "ABC";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("result :: "+ result);
        assertTrue(result==3);
        assertFalse(result==2);
    }

    @Test
    public void 대소문자_ABC(){
        String str = "ABsgsdhASFdfC";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("result :: "+ result);
        assertTrue(result==6);
        assertFalse(result==5);
    }

}