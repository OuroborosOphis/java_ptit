
package Mang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class J02035_quayPhai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            long n = sc.nextLong();
            ArrayList<Long> a = new ArrayList<>();
            for (int i = 0; i < n; i++){
                a.add(sc.nextLong());
            }
            ArrayList<Long> b = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                b.add(a.get(i));
            }
            Collections.sort(b);            
            long x = a.get(0);
            int idx = -1;
            for (int i = 0; i < n; i++){
                if (x == b.get(i)) {
                    idx = i; break;
                }
            }
            if (idx == 0)
            System.out.println(idx);
            else System.out.println(n - idx);
        }
    }
}
