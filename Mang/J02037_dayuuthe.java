
package Mang;

import java.util.Scanner;


public class J02037_dayuuthe {
    public static boolean check(String[] a){
        int odd = 0, even = 0, l = 0;
        for (String x : a){
            if ((x.charAt(x.length() - 1) - '0') % 2 == 0) even++;
            else odd++;
            l++;
        }
        if (l % 2 == 0 && even > odd) return true;
        else if(l % 2 == 1 && odd > even) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String[] s = sc.nextLine().split("\\s+");
            if (check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
