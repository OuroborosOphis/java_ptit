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
import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author DELL 7510
 */
public class J07032_soThuanNghichTrongFile {
    public static boolean check(int n){
        String s1 = Integer.toString(n);
        if (s1.length() == 1 || s1.length() % 2 == 0) return false;
        for (int i = 0; i < s1.length() / 2; i++){
            if (s1.charAt(i) != s1.charAt(s1.length() - i - 1)) return false;
        }
        while(n > 0){
            if ((n % 10) % 2 == 0) return false;           
            n /= 10;
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {  
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) sc2.readObject();
        ArrayList<Integer> num = new ArrayList<>();
        Set<Integer> set1 = new TreeSet<>(a);
        Set<Integer> set2 = new TreeSet<>(b);
        for (int i : set1)
        {
            if (set2.contains(i) && check(i))
                num.add(i);
            if (num.size() == 10)
                break;
        }
        for (int i : num)
            System.out.println(i + " " + (Collections.frequency(a, i) + Collections.frequency(b, i)));
    }
}
