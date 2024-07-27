package Mang;

import java.util.Scanner;

public class J02106_matrannhiphan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int ans = 0;
        while (n --> 0) {
            int cnt = 0;
            int b[] = new int[3];
            for (int i = 0; i < 3; i++) {
                b[i] = input.nextInt();
            }
            input.nextLine();
            for (int i = 0; i < 3; i++) {
                if (b[i] == 1) cnt++;
            }
            if (cnt > 1) ans++;
        }
        System.out.println(ans);
    }
}
