
package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

// LinkedHashSet co thu tu, la thu tu add
// con dau giong hashset

public class hashset {
    
    // add size contains  remove O(1) 
    // khong co thu tu
    // addAll retainAll removeAll
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(100);
            set.add(number);
        }
        System.out.println(set.size());
        for (int x : set){
            System.out.print(x + " ");
        }
        System.out.println("");
        //using Iterator
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
      
        if (set.contains(4)) System.out.println("Found");
        else System.out.println("Not Found");
        set.remove(4); // xoa 4 khoi set 
    }
}
