
package XauKyTu;

import java.util.HashMap;
import java.util.Scanner;


public class J03010_diachiemail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0){
            String s = sc.nextLine();
            s = s.trim().toLowerCase();
            String[] arr = s.split("\\s+");
            String email = arr[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++){
                email += arr[i].charAt(0);
            }
            if (map.containsKey(email)) {
                int cnt = map.get(email); cnt++;
                map.put(email, cnt);
                System.out.println(email + cnt + "@ptit.edu.vn");
            }
            else {
                map.put(email, 1);
                System.out.println(email + "@ptit.edu.vn");
            }           
        }
    }   
}
