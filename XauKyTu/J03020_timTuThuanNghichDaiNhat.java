/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XauKyTu;

import java.util.Scanner;

/**
 *
 * @author DELL 7510
 */
public class J03020_timTuThuanNghichDaiNhat {
    public static boolean check(String s){
        String x = s.substring(s.length() - 1, 0);
        if (x.compareTo(s) == 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(("\\s+"));
        String a = sc.nextLine();
        String x = a.substring(a.length() - 1, 0);
        System.out.println(x);
    }
}
