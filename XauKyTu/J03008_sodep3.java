
package XauKyTu;

import helloWorld.fuck_you_world.*;
import java.util.Scanner;


public class J03008_sodep3 {
    static boolean check(String s) {
        int n = s.length();
        String x = "";
        

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7') return false;
            x = s.charAt(i) + x;
        }
        if (s.compareTo(x) == 0) {
            return true;
        }
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
