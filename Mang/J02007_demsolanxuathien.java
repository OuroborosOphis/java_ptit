
package Mang;

import java.util.Scanner;
public class J02007_demsolanxuathien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // dung mang danh dau
        int t = input.nextInt();
        for (int j = 1; j <= t; j++) {
            int n = input.nextInt();
            int a[] = new int[n];
            int f[] = new int[100001];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
                f[a[i]]++;
            }
            System.out.printf("Test %d:\n", j);
            for (int i = 0; i < n; i++) {
                if (f[a[i]] > 0) {
                    System.out.printf("%d xuat hien %d lan\n", a[i], f[a[i]]);
                    f[a[i]] = 0;
                }
            }
        }  
    }
}


    



    

