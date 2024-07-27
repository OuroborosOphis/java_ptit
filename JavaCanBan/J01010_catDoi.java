/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaCanBan;

import java.util.Scanner;

/**
 *
 * @author DELL 7510
 */
public class J01010_catDoi {
    static String catdoi(String s){
        String res = "";
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0' || s.charAt(i) == '1')
                res += s.charAt(i);
            else if (s.charAt(i) == '8' || s.charAt(i) == '9')
                res += '0';
            else return "INVALID";
        }
        long n = Long.parseLong(res);
        if (n == 0) return "INVALID";
        return String.valueOf(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String n = sc.nextLine();
            System.out.println(catdoi(n));
        }
    }
}
