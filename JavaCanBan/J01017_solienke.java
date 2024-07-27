package JavaCanBan;

import java.util.Scanner;

public class J01017_solienke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t --> 0) {
            String s = sc.next();
            int cnt = 0;
            for (int i = 1; i < s.length(); i++){
                boolean c = Math.abs(s.charAt(i) - s.charAt(i - 1)) == 1;
                if (!c) {
                    cnt = 1;
                    break;
                }
            }
            if (cnt == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }    
    }
}

