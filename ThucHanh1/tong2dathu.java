
package ThucHanh1;

import java.util.Scanner;
import java.util.TreeMap;
import javax.naming.spi.DirStateFactory;

class DaThuc {
    private String s;

    public DaThuc(String s) {
        this.s = s;
    }
    
    public void xuly(String p, TreeMap<Integer, Integer> res){
        String[] arr = p.split("\\s+");
        for (String ar : arr) {
            String[] part = ar.split("\\*x\\^");
            int coeff = Integer.parseInt(part[0]);
            int power = Integer.parseInt(part[1]);
            res.put(power, res.getOrDefault(power,0) + coeff);
        }
    }
    
    public String cong(DaThuc q){
        TreeMap<Integer, Integer> tm1 = new TreeMap<>();
        TreeMap<Integer, Integer> tm2 = new TreeMap<>();
        String a = this.s;
        String b = q.s;
        for (int i = a.length() - 1; i >= 0; i--){
            //if (a.charAt(i))
        }
        return "";
    }
    
    public void out(){
        System.out.println(this.s);
    }       
}

public class tong2dathu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            //DaThuc r = p.cong(q);
            //r.out();
    }
}
