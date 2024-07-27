package JavaCanBan;

import java.util.Scanner;

public class J01021_tinhluythua {
    static long mod = 1000000007;
    
    public static long pow(long n, long k) {
        if (k == 0) {
            return 1L;
        }
        long x = pow(n, k / 2);
        x = (x * x) % mod;
        if (k % 2 == 0){
            return x;
        } else {
            return (n * x) % mod;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            System.out.println(pow(a, b));
        }    
    }
}

    


    

