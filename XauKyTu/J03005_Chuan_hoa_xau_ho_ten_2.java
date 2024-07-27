
package XauKyTu;

import helloWorld.fuck_you_world.*;
import java.util.Scanner;

public class J03005_Chuan_hoa_xau_ho_ten_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        input.nextLine();
        while (t --> 0) {
            String s = input.nextLine();
            String a[] = s.trim().split("\\s+");
            String res = "";
            for (int i = 1; i < a.length; i++){
                String tmp = "";
                tmp += Character.toUpperCase(a[i].charAt(0));
                for (int j = 1; j < a[i].length(); j++){
                    tmp += Character.toLowerCase(a[i].charAt(j));
                }
                res += tmp + " ";
            }
            res = res.trim() + ", " + a[0].toUpperCase();
            System.out.println(res.trim());
        }
    }
}
