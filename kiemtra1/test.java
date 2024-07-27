
package kiemtra1;

import java.math.BigInteger;

public class test {
    public static void main(String[] args) {
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= 10000; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        System.out.println(result);
    }
}
