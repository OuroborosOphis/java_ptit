/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaoraFile;

import java.io.File;
import java.io.FileNotFoundException;
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
public class J07011_tu_khac_nhau_trong_file_van_ban {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
//        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String str ="";
        while(n-- > 0){
            str += sc.nextLine() + " ";
        }
        String[] s = str.toLowerCase().split("[^a-z0-9]+");
        Map<String, Integer> mp = new HashMap<>();
        ArrayList<String> l = new ArrayList<>();
        for (String i : s){
            if(i.length() > 0){
                if(mp.containsKey(i)){
                    mp.put(i, mp.get(i)+1);
                }else{
                    mp.put(i, 1);
                    l.add(i);
                }
            }           
        }
        Collections.sort(l);
        Collections.sort(l, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return mp.get(o2).compareTo(mp.get(o1));
            }
            
        });
        for(String i : l){
            System.out.println(i + " " + mp.get(i));
        }
    }
    
}
