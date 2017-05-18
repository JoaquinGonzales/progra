

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class binaryArrayTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BinaryArrayTest
{
    @Test
    public void binaryOfZeroIsZero()
    {
        assertArrayEquals(new int[]{0}, BinaryArray.toBinaryArray(0));
    }
    
    @Test
    public void binaryOfTwoIsOneZero()
    {
        assertArrayEquals(new int[]{1,0}, BinaryArray.toBinaryArray(2));
    }
    
    @Test
    public void binaryOfSevenIsOneOneOne()
    {
        assertArrayEquals(new int[]{1,1,1}, BinaryArray.toBinaryArray(7));
    }
    
    @Test
    public void binaryOf230Is_1_1_1_0_0_1_1_0()
    {
        assertArrayEquals(new int[]{1,1,1,0,0,1,1,0}, BinaryArray.toBinaryArray(230));
    }
    
    @Test
    public void swapExtremesOfAnArrayWithOnlyTwoElements()
    {
        int[] expected = new int[]{1,1};
        int[] array = new int[]{1,1}; 
        BinaryArray.swapExtremeBits(array);
        assertArrayEquals(expected, array);
    }
    
    @Test
    public void swapExtremesOfArrayWithThreeElements100()
    {
        int[] expected = new int[]{0,0,1};
        int[] array = new int[]{1,0,0}; 
        BinaryArray.swapExtremeBits(array);
        assertArrayEquals(expected, array);
    }
    @Test 
    public void convertBinaryToDecimal()
    {
        int[] array = new int[]{1};
        assertEquals(1,BinaryArray.convertToDecimal(array));
    }
    @Test
    public void convertToBinaryToDecimalANumberLarge()
    {
        int[] array = new int[]{1,0,0};
        assertEquals(4,BinaryArray.convertToDecimal(array));
    }
    @Test(timeout=0)
    public void convertBinaryArray()
    {
        int[] array = new int[]{1,1,0};
        assertEquals(6,BinaryArray.convertToDecimal(array));
    }
}
