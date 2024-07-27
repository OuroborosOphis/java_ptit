
package vaoraFile;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class J07004_soKhacNhauTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (sc.hasNext()){
            int n = sc.nextInt();
            if (map.containsKey(n)){
                int tanSuat = map.get(n);
                ++tanSuat;
                map.put(n, tanSuat);
            } else{
                map.put(n, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
