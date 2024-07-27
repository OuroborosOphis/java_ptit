
package XauKyTu;

import java.math.BigInteger;
import java.util.Scanner;


public class J03013_hieuSoNguyenLon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if (a.compareTo(b) < 0) {  // a < b
                BigInteger c = a;
                a = b;
                b = c;
            } // a > b
            BigInteger ans = a.subtract(b);
            if (ans.toString().length() < a.toString().length()) System.out.print(0);
            System.out.println(a.subtract(b));
        }
    }
}
