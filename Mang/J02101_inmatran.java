
package Mang;

import java.util.Scanner;
public class J02101_inmatran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int t = input.nextInt();
        
        while (t --> 0) {
            int n = input.nextInt();
            int a[][] = new int[n][n];
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = input.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < n; j++) {
                        System.out.printf("%d ", a[i][j]);
                    }
                }
                else {
                    for (int j = n - 1; j >= 0; j--) {
                        System.out.printf("%d ", a[i][j]);
                    }
                }
            }
            System.out.println("");
        }
    }
}
