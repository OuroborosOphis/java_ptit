/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaoraFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author DELL 7510
 */
public class J07006_soKhacNhauTrongFile3 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) o.readObject();
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int a : list){
            if(tm.containsKey(a)){
                int f = tm.get(a);
                f++;
                tm.put(a, f);
            } else {
                tm.put(a, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : tm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
