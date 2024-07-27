/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloWorld.fuck_you_world;

import java.util.Scanner;

public class primeNumber {
    boolean checkPrime(long n) {
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int t = input.nextInt();
        long n;
       
        while (t > 0) {
            n = input.nextLong();
            primeNumber obj = new primeNumber();
            boolean check = obj.checkPrime(n);
            if (check) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            t--;
        }
    }
}
