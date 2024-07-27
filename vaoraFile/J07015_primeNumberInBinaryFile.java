
package vaoraFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class J07015_primeNumberInBinaryFile {
    public static <T> List<T> doc(String file){
        List<T> list = new ArrayList<>();
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
            list = (List<T>) o.readObject();
            o.close();
        } catch (IOException | ClassNotFoundException e) {
        }
        return list;
    }
    
    public static boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        List<Integer> list = doc("SONGUYEN.in");
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int i : list){
            if (isPrime(i)){
                if (tm.containsKey(i)){
                    int f = tm.get(i);
                    f++;
                    tm.put(i, f);
                } else{
                    tm.put(i, 1);
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : tm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
