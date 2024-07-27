
package XauKyTu;

import java.util.Scanner;

public class J03040_bienSoDep {
    public static boolean check(String s){
        if(s.charAt(0) < s.charAt(1) && s.charAt(1) < s.charAt(2) && s.charAt(2) < s.charAt(3) && s.charAt(3) < s.charAt(4))
            return true;
        if(s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4))
            return true;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != '6' && s.charAt(i) != '8') return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine().substring(5).replace(".", "");
            if (check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
