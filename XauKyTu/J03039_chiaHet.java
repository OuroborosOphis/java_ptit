
package XauKyTu;

import java.math.BigInteger;
import java.util.Scanner;


public class J03039_chiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if (a.compareTo(b) < 0) {
                BigInteger c = a;
                a = b;
                b = c;
            }
            BigInteger k = a.divide(b);
            if (k.multiply(b).compareTo(a) == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
