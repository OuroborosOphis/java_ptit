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
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author DELL 7510
 */
public class J07030_capSNTtrongFile1 {
    public static boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i <= (int)Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
   
        Set<Integer> list1 = new TreeSet<>((ArrayList) o1.readObject());
        Set<Integer> list2 = new TreeSet<>((ArrayList) o2.readObject());
        for (Integer i : list1)
            if (i < 1000000 - i && isPrime(i) && list2.contains(1000000 - i) && isPrime(1000000 - i))
                System.out.println(i + " " + (1000000 - i));
    }
    
}
