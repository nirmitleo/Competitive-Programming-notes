package TopCoder;

import java.math.BigInteger;

public class Multifactorial {
    private BigInteger max = BigInteger.valueOf(1000000000000000000L);
    public String calcMultiFact(int nn, int kk)
    {
        BigInteger n = BigInteger.valueOf(nn);
        BigInteger k = BigInteger.valueOf(kk);
        BigInteger result = BigInteger.ONE;

        while (n.compareTo(k) > 0)
        {
            result = result.multiply(n);
            n = n.subtract(k);
            if (result.compareTo(max) > 0)
            {
                return "overflow";
            }
        }
        result = result.multiply(n);
        if(result.compareTo(max) > 0)
        {
            return "overflow";
        }
        return result.toString();
    }
}
