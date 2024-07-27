
package XauKyTu;

import helloWorld.fuck_you_world.*;
import java.util.Scanner;


public class J03025_xaudoixung {
    static  boolean check(String s) {
        int cnt = 0, n = s.length();
        for (int i = 0; i <= (n - 1) / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) cnt++;
        }
        if ((cnt <= 1 && n % 2 == 1) || (cnt == 1 && n % 2 == 0)) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t-- > 0) {
            String s = input.nextLine();
            if (check(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
