/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaoraFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DELL 7510
 */
public class J07012_tu_khac_nhau_trong_file_nhi_phan {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
//        Scanner sc = new Scanner(System.in);
        
        
        Map<String, Integer> mp = new HashMap<>();
        ArrayList<String> l = (ArrayList<String>) ois.readObject();
        ArrayList<String> a = new ArrayList<>();
        String str="";
        for (String i : l){
            str += i + " ";
        }
        String[] s = str.toLowerCase().split("[^a-z0-9]+");
        for (String i : s){
            if(i.length() > 0){
                if(mp.containsKey(i)){
                    mp.put(i, mp.get(i)+1);
                }else{
                    mp.put(i, 1);
                    a.add(i);
                }
            }           
        }
        Collections.sort(a);
        Collections.sort(a, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return mp.get(o2).compareTo(mp.get(o1));
            }
            
        });
        for(String i : a){
            System.out.println(i + " " + mp.get(i));
        }
    }
    
}
