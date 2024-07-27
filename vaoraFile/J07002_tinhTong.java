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
public class J07002_tinhTong {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        long res = 0;
        while (sc.hasNext()){
            if (sc.hasNextInt()){
                int next = sc.nextInt();
                res += next;
            } else{
                sc.next();
            }
        }
        System.out.println(res);
    }
}