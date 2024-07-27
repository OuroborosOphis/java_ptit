
package ThucHanh1;

import java.util.Scanner;
import java.util.TreeSet;


public class TapTuChungCua2Xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        
        while (t-- > 0){
            TreeSet<String> ts1 = new TreeSet<>();
            TreeSet<String> ts2 = new TreeSet<>();
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] arr1 = s1.split("\\s+");
            String[] arr2 = s2.split("\\s+");
            for (String x : arr1){
                ts1.add(x);
            }
            for (String x : arr2){
                ts2.add(x);
            }
            ts1.retainAll(ts2);
            if (ts1.size() == 0){
                System.out.print("NO");
            } else {
                for (String x : ts1){
                    System.out.print(x + " ");
                }
            }
            System.out.println("");
        }
    }
}
