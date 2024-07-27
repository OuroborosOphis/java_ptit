/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaoraFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author DELL 7510
 */
public class J07021_chuanHoaXauHoTen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        
        while(sc.hasNextLine())
        {
            String line = sc.nextLine().trim().toUpperCase();
            String[] a = line.split("\\s+");
            if (a[0].compareTo("END") == 0) break;
            line = "";
            for (String x : a){
                line += x.charAt(0) + x.substring(1).toLowerCase() + " ";
            }
            System.out.println(line.trim());
        }
    }
}
