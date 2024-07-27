
package Mang;

import java.util.Scanner;
public class J02010_sapxepdoichotructiep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int n = input.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = input.nextInt();
        int cnt = 0;
        for (int i = 0; i < n - 1; i++){
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            cnt++;
            System.out.printf("Buoc %d:", cnt);
            for (int k = 0; k < n; k++){
                System.out.printf(" %d", a[k]);
            }
            System.out.println("");
        }
    }
}


    

