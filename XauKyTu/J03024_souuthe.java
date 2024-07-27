
package XauKyTu;

import helloWorld.fuck_you_world.*;
import java.util.Scanner;


public class J03024_souuthe {
    static  int check(String s) {
        if (s.charAt(0) == '0') return -1;
        int n = s.length(), even = 0, odd = 0;
        for (int i = 0; i < n; i++) {
            int k = s.charAt(i) - '0';
            if (k >= 0 && k <= 9) {
                if (k % 2 == 0) even++;
                else odd++;
            } else return -1;
        }
        if (odd > even && n % 2 == 1) return 1;
        if (even > odd && n % 2 == 0) return 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t-- > 0) {
            String s = input.nextLine();
            if (check(s) == 1) {
                System.out.println("YES");
            } else if (check(s) == 0) {
                System.out.println("NO");
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
