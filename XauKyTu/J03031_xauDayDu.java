
package XauKyTu;

import java.util.HashSet;
import java.util.Scanner;


public class J03031_xauDayDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine());
            HashSet<Character> hs = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                hs.add(s.charAt(i));
            }
            if (k + hs.size() >= 26) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
