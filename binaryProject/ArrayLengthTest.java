

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ArrayLengthTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ArrayLengthTest
{
    @Test
    public void arrayLengthOfZeroIsOne(){
        assertEquals(1,BinaryArray.arrayLength(0));
    }
    
    @Test
    public void arrayLengthOfOneIsOne(){
        assertEquals(1,BinaryArray.arrayLength(1));
    }
    
    @Test
    public void arrayLengthOfTwoIsTwo(){
        assertEquals(2,BinaryArray.arrayLength(2));
    }

    @Test
    public void arrayLengthOfFiveIsThree(){
        assertEquals(3,BinaryArray.arrayLength(5));
    }
    
    @Test
    public void arrayLengthOfEightIsFour(){
        assertEquals(4,BinaryArray.arrayLength(8));
    }
    
    @Test
    public void arrayLengthOfFifteenIsFour(){
        assertEquals(4,BinaryArray.arrayLength(15));
    }
}
