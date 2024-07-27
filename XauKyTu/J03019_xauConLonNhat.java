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
public class J03019_xauConLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), res = "";
        // lap tu cuoi
        // gap ky tu >= thi thi them vao
        char k = s.charAt(s.length() - 1);
        for (int i = s.length() - 2; i >= 0; i--){
             if (s.charAt(i) >= k) {
                 k = s.charAt(i);
                 res = k + res;
             }
        }
        System.out.println(res + s.charAt(s.length() - 1));
    }
}
