
package Collection;

import java.util.TreeSet;
import java.util.Scanner;

public class treeSet {
    // add remove size contain addAll retainAll removeAll
    // O(log n)
    // Red Black Tree (cay tim kiem nhi phan tu can bang)
    // co thu tu
    // in ra cac phan tu khac nhau trong mang, theo gia tri tu nho den lon
    
    // first last lower higher ceiling floor
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();  
        String[] arr = s.split("\\s+");
        for (String x : arr){
            set.add(x);
        }
        for(String x : set){
            System.out.println(x);
        }
        
        TreeSet<Integer> ts = new TreeSet<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            ts.add(sc.nextInt());
        }
        System.out.println(ts.first()); // phan tu nho nhat
        System.out.println(ts.last()); // phan tu lon nhat
        System.out.println(ts.higher(5)); // phan tu nho nhat > 5 nam trong set
        System.out.println(ts.lower(5));  // phan tu lon nhat < 5
        System.out.println(ts.ceiling(5)); // phan tu nho nhat >= 5
        System.out.println(ts.floor(5)); // phan tu lon nhat <= 5
        
        ts.pollLast(); // xoa phan tu o cuoi
        ts.pollFirst(); // xoa phan tu o dau
        
        System.out.println(ts.headSet(6)); // in ra cac phan tu trong set < 6
        System.out.println(ts.tailSet(6));  // in ra cac phan tu trong set >= 6
       
        
        
    }
}
