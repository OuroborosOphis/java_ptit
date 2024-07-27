
package Mang;

import java.util.Scanner;

public class J02016_bo3soPytago {
    static boolean check(long a[], int n) {
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                long sum = a[i] + a[j];
                for (int k = j + 1; k < n; k++) {
                    if (a[k] == sum) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int t = input.nextInt();
        
        while (t --> 0) {
            int n = input.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                long k = input.nextLong();
                a[i] = k * k;
            }
            
            if (check(a, n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
        }
    }
}
