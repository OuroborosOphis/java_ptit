
package vaoraFile;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;





public class J07005_soKhacNhauTrongFile2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream is = new FileInputStream("DATA.IN");
        DataInputStream dis = new DataInputStream(is);
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int i = 0; i < 100000; i++){
            int a = dis.readInt();
            if(tm.containsKey(a)){
                int f = tm.get(a);
                f++;
                tm.put(a, f);
            } else {
                tm.put(a, 1);
            }
        }
        dis.close(); is.close();
        for (Map.Entry<Integer, Integer> entry : tm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
