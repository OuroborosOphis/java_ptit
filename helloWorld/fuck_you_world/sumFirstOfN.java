/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package helloWorld.fuck_you_world;

import java.util.Scanner;

/**
 *
 * @author DELL 7510
 */
public class sumFirstOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int t = input.nextInt();
        long n, sum;
        while(t > 0) {
            
            n = input.nextLong();
            sum = n * (n + 1) / 2;
            System.out.println(sum);
            t--;
        }
        input.close();
        
    }
}
