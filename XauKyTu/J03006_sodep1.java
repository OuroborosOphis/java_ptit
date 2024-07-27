
package XauKyTu;

import helloWorld.fuck_you_world.*;
import java.util.Scanner;

public class J03006_sodep1 {
    static  boolean check(String s) {
        for (int i = 0; i < s.length() / 2 + 1; i++) {
            if ((int)s.charAt(i) % 2 == 1 || s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while(t --> 0) {
            String s = input.nextLine();
            if (check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
