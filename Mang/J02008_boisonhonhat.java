
package Mang;

import java.util.Scanner;
public class J02008_boisonhonhat {
    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int t = input.nextInt();
        while(t --> 0) {
            int n = input.nextInt();
            long ans = 1;
            for (long i = 2; i <= n; i++) {
                ans = lcm(ans, i);
            }
            System.out.println(ans);
        }  
    }
}


    



    



    

