package Tests;

import Algos.IntegerPalindrome;
import Algos.MostRepeatedChar;
import org.junit.Assert;

public class MostRepeatedCharTest {

    @org.junit.jupiter.api.Test
    void mostRepeatedCharTest() {
        String str = "Hello, World!";
        Character expectedResult = 'l';

        MostRepeatedChar mostRepeatedChar = new MostRepeatedChar();
        Character actualResult = mostRepeatedChar.mostRepeatedChar(str);
        Assert.assertEquals(expectedResult, actualResult);
    }

}
