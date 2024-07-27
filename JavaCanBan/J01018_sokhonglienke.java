package JavaCanBan;

import java.util.Scanner;

public class J01018_sokhonglienke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t --> 0) {
            String s = sc.next();
            int cnt = 0, sum = s.charAt(0) - 48;
            for (int i = 1; i < s.length(); i++){
                boolean c = Math.abs(s.charAt(i) - s.charAt(i - 1)) == 2;
                if (!c) {
                    cnt = 1;
                    break;
                }
                sum = sum + s.charAt(i) - 48;
            }
            if (cnt == 0 && sum % 10 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }    
    }
}

    

