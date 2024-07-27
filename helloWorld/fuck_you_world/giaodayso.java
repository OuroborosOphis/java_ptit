
package helloWorld.fuck_you_world;

import java.util.Scanner;
public class giaodayso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int m = input.nextInt();
        // dung mang danh dau
        int[] a = new int[1001];
        int[] b = new int[1001];
        
        for (int i = 0; i < n; ++i) {
            int x = input.nextInt();
            a[x] = 1;
        }
        for (int i = 0; i < m; ++i) {
            int x = input.nextInt();
            b[x] = 1;
        }
        for (int i = 0; i < 1001; ++i) {
            if (a[i] == 1 && b[i] == 1) {
                System.out.printf("%d ",i);
            }
        }
    }
}
