
package XauKyTu;

import java.util.Scanner;


public class J03032_daotu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            for (int i = 0; i < arr.length; i++) {
                StringBuilder x = new StringBuilder(arr[i]);
                System.out.print(x.reverse().toString() + " ");
            }
            System.out.println();
        }
    }
}
