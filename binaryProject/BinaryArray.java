
/**
 * Write a description of class BinaryArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinaryArray
{
    public static int[] toBinaryArray(int n)
    {
        int[] binary = new int[arrayLength(n)];
        
        for(int i = binary.length; i > 0 ; i--)
        {
            binary[i-1] = n % 2;
            n = n / 2;
        }

        return binary;
    }
    
    public static int arrayLength(int n)
    {
        int exp = 1;
        while(Math.pow(2, exp) <= n)
        {
            exp++;
        }
        return exp;
    }
    
    public static void swapExtremeBits(int[] array)
    {
        int aux;
        for(int index=0; index<array.length/2; index++){
            aux = array[index];
            array[index] = array[array.length - index -1];
            array[array.length - index -1] = aux;
        }
    }
    // Implemented by Trainer
    public static int[] toBinaryArrayEx(int n)
    {
        int length = calculateBinaryArraySize(n);
        int[] binary = new int[length];
        for (int index=length -1; index >=0; index--){
            binary[index] = n%2;
            n = n / 2;
        }
        return binary;
    }
    
    public static int calculateBinaryArraySize(int n){
        int length = 1;
        while(n>1){
            length ++;
            n= n/2;
        }
        return length;
    }
    public static int convertToDecimal(int[]array)
    {
        int value=0;
        int counter=0;
        for(int i=array.length-1; i>=0; i--)
        {
            value += array[i]*(int)Math.pow(2,counter);
            counter++;
        }
        return value;
    }
}
