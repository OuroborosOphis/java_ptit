
package helloWorld.fuck_you_world;

import java.util.Scanner;
public class tonguocso_1 {
    
    static int primes[] = new int[2000001];
    
    public static void sang() {
        for (int i = 2; i * i <= 2000000; i++) {
            if (primes[i] == 0) {
                for (int j = i * i; j <= 2000000; j += i) {
                    primes[j] = i;
                }
            }
        }
        for (int i = 2; i <= 2000000; i++) {
            if (primes[i] == 0) {
                primes[i] = i;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int t = input.nextInt();
        int n;
        long sum = 0;
        sang();
        while (t --> 0) {
            n = input.nextInt();
            while (n != 1) {
                sum += primes[n];
                n /= primes[n];
            }
        }
        System.out.println(sum);
    }
}
