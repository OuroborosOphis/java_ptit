
package Mang;

// diem can bang: x
// tai x thi trai = phai
// => 2a + x = s 

import java.util.Scanner;
public class J02014_balancePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t --> 0) {
            int n = sc.nextInt();
            int a[] = new int[n + 1];
            int s = 0, p = -1, x = 0;
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
                s += a[i];
            }
            for (int i = 1; i <= n; i++) {
                if (x * 2 + a[i] == s) {
                    p = i;
                    break;
                }
                x += a[i];
            }
            System.out.println(p);
            
        }
    }
}
