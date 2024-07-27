
package helloWorld.fuck_you_world;

import java.util.Scanner;
public class phantichthuasonto {
    boolean prime(int n ) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        phantichthuasonto obj = new phantichthuasonto();
        
        int t = input.nextInt();
        long n;
        int dem = 1;
        while (t --> 0) {
            n = input.nextLong();
            
            String s ="Test " + dem + ": ";
            for (int i = 2; i <= n; ++i) {
                int cnt = 0;
                if (obj.prime(i) && n % i == 0) {
                    while (n % i == 0) {
                        cnt++;
                        n /= i;
                    }
                    s += i + "(" + cnt + ") ";                 
                }             
            } 
            System.out.println(s);
            dem++;
        }
        input.close();
    }
}
