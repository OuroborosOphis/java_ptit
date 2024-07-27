package XauKyTu;


import helloWorld.fuck_you_world.*;
import java.util.Scanner;

public class J03007_sodep2 {

    static boolean check(String s) {
        int sum = 0, n = s.length();
        String x = "";
        if (s.charAt(0) != '8' || s.charAt(n - 1) != '8') {
            return false;
        }

        for (int i = 0; i < n; i++) {
            sum += s.charAt(i) - '0';
            x = s.charAt(i) + x;
        }
        if (sum % 10 == 0 && s.compareTo(x) == 0) {
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
