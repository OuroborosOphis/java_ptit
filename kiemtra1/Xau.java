
package kiemtra1;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Xau {
    private String s;
    
    public void nhapXau(){
        
    }
    public void maSv(){
        
    }
    public void tachTu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 xau: ");
        s = sc.nextLine();
        Pattern pt = Pattern.compile("\\b\\D+\\b");
        Matcher mc = pt.matcher(s);
        
        while (mc.find()){
            String word = mc.group();
            System.out.println(word);
        }
    }
    
    public void chuanHoa(){
        s = s.replaceAll("\\,\\s*", "\\, ");
    }
}
