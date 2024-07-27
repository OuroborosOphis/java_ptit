
package XauKyTu;

import java.util.Scanner;


public class J03027_rutGonXauKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int ok = 1;
        while (ok != 0) {
            ok = 0;
            for (int i = 1; i < s.length(); i++){
                if (s.charAt(i) == s.charAt(i - 1)) {
                    ok = 1;
                    s = s.substring(0, i - 1) + s.substring(i + 1);
                }
            }
        }
        if (s.isEmpty()) System.out.println("Empty String");
        else System.out.println(s);    
    }
}
