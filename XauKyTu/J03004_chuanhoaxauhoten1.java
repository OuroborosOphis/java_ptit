package XauKyTu;

import java.util.Scanner;

public class J03004_chuanhoaxauhoten1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        input.nextLine();
        while (t --> 0) {
            String s = input.nextLine();
            String a[] = s.trim().split("\\s+");
            String res = "";
            for (String x : a){
                String tmp = "";
                tmp += Character.toUpperCase(x.charAt(0));
                for (int i = 1; i < x.length(); i++){
                    tmp += Character.toLowerCase(x.charAt(i));
                }
                res += tmp + " ";
            }
            System.out.println(res.trim());
        }
    }
}
