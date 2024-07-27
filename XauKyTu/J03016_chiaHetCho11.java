
package XauKyTu;

import java.math.BigInteger;
import java.util.Scanner;


public class J03016_chiaHetCho11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = new BigInteger("11");
            BigInteger k = a.divide(b);
            if (k.multiply(b).compareTo(a) == 0) System.out.println("1");
            else System.out.println("0");
        }
    }
}
