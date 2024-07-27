/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaoraFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DELL 7510
 */
public class J07022_loaiBoSoNguyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s;
        ArrayList<String> list = new ArrayList<>();
        while (sc.hasNext())
        {
            s = sc.next();
            try
            {
                Integer.parseInt(s);
            }
            catch (NumberFormatException e)
            {
                list.add(s);
            }
        }
        Collections.sort(list);
        for (String i : list)
            System.out.print(i + " ");
        
    }
}