
package JavaCanBan;

import java.util.Scanner;
public class J01025_hinhvuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        // tim min cua canh trai duoi va max phai tren
        int x1 = Math.min(a1, c1);
        int y1 = Math.min(a2, c2);
        int x2 = Math.max(b1, d1);
        int y2 = Math.max(b2, d2);
        int res = Math.max(x2 - x1, y2 - y1);
        System.out.println(res * res);
    }
}
