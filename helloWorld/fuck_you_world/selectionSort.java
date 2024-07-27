
package helloWorld.fuck_you_world;

import java.util.Scanner;
public class selectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int[] numbers = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            numbers[i] = input.nextInt();
        }
        int min;
      
        for (int i = 0; i < n - 1; ++i) {
            min = i;
            String s = "Buoc " + (i + 1) + ":";
            for (int j = i + 1; j < n; ++j ) {
                if (numbers[j] < numbers[min]) min = j;
                
            }
            int tmp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = tmp;
            for (int k = 0; k < n; ++k) {
                s += " " + numbers[k];
            }
            System.out.println(s);
        }       
    }
}
