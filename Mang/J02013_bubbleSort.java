
package Mang;

import java.util.Scanner;
public class J02013_bubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int n = input.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = input.nextInt();
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    swapped = true;
                }
            }
            if (swapped == false) break;
            System.out.printf("Buoc %d:", i + 1);
            for (int k = 0; k < n; k++) {
                System.out.printf(" %d", a[k]);
            }
            System.out.println("");           
        }       
    }
}


    



    



    

