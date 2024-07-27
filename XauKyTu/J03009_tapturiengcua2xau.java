
package XauKyTu;

import java.util.Scanner;
import java.util.TreeSet;


public class J03009_tapturiengcua2xau {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            TreeSet<String> set1 = new TreeSet<>();
            TreeSet<String> set2 = new TreeSet<>();
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] arr1 = s1.split("\\s+");
            for (String x : arr1) {
                set1.add(x);
            }
            String[] arr2 = s2.split("\\s+");
            for (String x : arr2){
                set2.add(x);
            }
            
            set1.removeAll(set2);
            for (String x : set1) {
                System.out.print(x + " ");
            }
            System.out.println("");
        }      
    }
}
