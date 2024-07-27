
package Mang;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class J02009_xepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dem = sc.nextInt();
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        while (dem-- > 0){
            int t = sc.nextInt();
            int d = sc.nextInt();
            if (tm.containsKey(t)) {
                int v = tm.get(t); v += d;
                tm.put(t, v);
            } else{
                tm.put(t, d);
            }
        }
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : tm.entrySet()) {
            if (entry.getKey() < res) res += entry.getValue();
            else res = entry.getKey() + entry.getValue();
        }
        System.out.println(res);
    }
}
