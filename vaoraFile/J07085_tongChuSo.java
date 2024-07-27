/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaoraFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author DELL 7510
 */
public class J07085_tongChuSo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) o.readObject();
        for (String i : list){
            String n = "";
            long sum = 0;
            for (int j = 0; j < i.length(); j++){
                if (i.charAt(j) >= '0' && i.charAt(j) <= '9'){
                    n += i.charAt(j);
                    sum += (i.charAt(j) - '0');
                }
            }
            BigInteger b = new BigInteger(n);
            System.out.println(b + " " + sum);
        }
    }
}
