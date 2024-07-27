
package Mang;

import java.util.Scanner;
public class J02012_insertionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int n = input.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = input.nextInt();
        System.out.printf("Buoc 0: %d\n", a[0]);
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int pos = i;
            for (int j = i - 1; j >= 0; j--) {
                if (key < a[j] ) {
                    a[pos] = a[j];
                    pos = j;
                }
            } 
            a[pos] = key;
            System.out.printf("Buoc %d:", i);
            for (int j = 0; j <= i; j++) {
                System.out.printf(" %d", a[j]);
            }
            System.out.println("");
        }
        
    }
}


    



    

