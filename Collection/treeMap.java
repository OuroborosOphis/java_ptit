
package Collection;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class treeMap {
    // sap xep theo thu tu < -> >
    // O(log n) 
    public static void main(String[] args) {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 10; i+=2){
            map.put(i, i * 2);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());         
        }
        // nhu treeset
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
        System.out.println(map.headMap(6));
        System.out.println(map.tailMap(4));
        // lowerKey higherKey floorKey ceilingKey
        System.out.println(map.pollFirstEntry());  // tra ve entry dau va xoa no
        
        // ky tu xuat hien nhieu nhat trong xau ...
        
        String s = sc.nextLine();
        TreeMap<Character, Integer> map1 = new TreeMap<>();
        for (int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if (map1.containsKey(x)){
                int tanSuat = map1.get(x); ++tanSuat;
                map1.put(x, tanSuat);
            }
            else {
                map1.put(x, 1);
            }
        }
        
        char res1 = '0', res2 = '0';
        int tanSuat1 = 0, tanSuat2 = (int)1e9;
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (entry.getValue() > tanSuat1){
                tanSuat1 = entry.getValue();
                res1 = entry.getKey();
            }
            if (entry.getValue() <= tanSuat2){
                tanSuat2 = entry.getValue();
                res2 = entry.getKey();
            }
        }
        
        System.out.println(res1 + " " + tanSuat1);
        System.out.println(res2 + " " + tanSuat2);
    }
}
