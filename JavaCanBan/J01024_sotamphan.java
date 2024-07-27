
package JavaCanBan;

import java.util.Scanner;
public class J01024_sotamphan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t --> 0) {
            int n = sc.nextInt();
            int ok = 1;
            while (n > 0) {
                int mod = n % 10;
                if (mod != 1 && mod != 0 && mod != 2) {
                    System.out.println("NO");
                    ok = 0;
                    break;
                }
                n /= 10;
            }
            if (ok == 1) System.out.println("YES");
        }
    }
}
