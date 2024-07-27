
package helloWorld.fuck_you_world;

import java.util.Scanner;
public class fibonacci {
    long makeFibo(int n) {
        if (n <= 1) return n;
        
        long[] fibo = new long[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;
        
        for (int i = 2; i <= n; ++i) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        return fibo[n];
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int t = input.nextInt();
        int n;
        
        while (t > 0) {
            n = input.nextInt();
            fibonacci obj = new fibonacci();
            long result = obj.makeFibo(n);
            System.out.println(result);
            t--;
        }
    }
}
