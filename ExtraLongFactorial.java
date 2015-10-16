package extralongfactorial;

import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author Dish Ahuja
 */
public class ExtraLongFactorial {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      calculatefact(45);  
    
    }
    public static void calculatefact(int N)
    {
       BigInteger big;
       
        big=BigInteger.ONE;
        for(int i=1;i<=N;i++)
        {
            big=big.multiply(BigInteger.valueOf(i));
        }
       System.out.println(big);
    }
    
}
