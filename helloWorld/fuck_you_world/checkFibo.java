
package helloWorld.fuck_you_world;

import java.util.Scanner;
public class checkFibo {
    boolean check(long n) {
        if (n <= 1) return true;
        long[] fiboValues = new long[93];
        fiboValues[0] = 0;
        fiboValues[1] = 1;
        
        for (int i = 2; i <= 92; ++i) {
            fiboValues[i] = fiboValues[i - 1] + fiboValues[i - 2];
            if (n == fiboValues[i]) return true;
        }
        return false;     
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        long n;
        while (t > 0) {
            n = input.nextLong();
            checkFibo obj = new checkFibo();
            boolean check = obj.check(n);
            if (check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
}
