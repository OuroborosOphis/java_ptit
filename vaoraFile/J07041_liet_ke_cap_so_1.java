/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaoraFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author DELL 7510
 */
public class J07041_liet_ke_cap_so_1 {
    static class Pair implements Serializable, Comparable<Pair>{
        private int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }

        @Override
        public int compareTo(Pair o) {
            return this.first - o.first;
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> a = (ArrayList<Pair>) o.readObject();
        Collections.sort(a);
        for(Pair i : a){
            if(i.getFirst() < i.getSecond()){
                System.out.println(i);
            }
        }
    }
}
