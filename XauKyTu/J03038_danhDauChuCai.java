
package XauKyTu;

import java.util.HashSet;
import java.util.Scanner;


public class J03038_danhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> set = new HashSet<>();
        String s = sc.next();
        for (int i = 0; i < s.length(); i++){
            set.add(s.charAt(i));
        }
        System.out.println(set.size());
    }
}
