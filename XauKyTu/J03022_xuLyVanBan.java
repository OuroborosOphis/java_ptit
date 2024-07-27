
package XauKyTu;

import java.util.Scanner;


public class J03022_xuLyVanBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = "";
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            s += line;
            if(line.isEmpty()) break;
        }
        s = s.toLowerCase();
        s = s.replaceAll("\\s+", " ");
        String[] arr = s.split("[\\.\\?\\!]");
        for (String x : arr) {
            x = x.trim();
            x = x.substring(0,1).toUpperCase() + x.substring(1);           
            System.out.println(x);
        }
    }
}
