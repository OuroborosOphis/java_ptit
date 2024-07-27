
package ThucHanh1;

import java.util.Scanner;


public class GCDofRowInMatrix {
    public static int gcd(int a, int b){
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] a = new int[m][n];
            int[] b = new int[m];
            for (int i = 0; i < m; i++){
                for (int j = 0; j < n; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            int k;
            for (int i = 0; i < m; i++){
                k = a[i][0];
                for (int j = 1; j < n; j++){
                    k = gcd(k, a[i][j]);
                }
                b[i] = k;
            }
            for (int x : b){
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}
