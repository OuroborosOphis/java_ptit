/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopVaDoiTuong;

import java.util.Scanner;

/**
 *
 * @author DELL 7510
 */
public class J04020_classPair {
    static class Pair<T1, T2>{
        private T1 n1;
        private T2 n2;

        public Pair(T1 n1, T2 n2) {
            this.n1 = n1;
            this.n2 = n2;
        }

        public T1 getN1() {
            return n1;
        }

        public T2 getN2() {
            return n2;
        }
        
        static boolean checkPrime(int n) {
        if(n < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
        
        public boolean isPrime() {
        if (checkPrime(Integer.parseInt(n1.toString())) && checkPrime(Integer.parseInt(n2.toString()))) {
            return true;
        }
        return false;
    }

        @Override
        public String toString() {
            return n1 + " " + n2;
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
