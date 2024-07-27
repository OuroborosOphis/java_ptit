
package kt2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class QuanLy {
    private List<PTGT> list;
    
    public QuanLy(){
        list = new ArrayList<>();
    }

    public List<PTGT> getList() {
        return list;
    }

    public void setList(List<PTGT> list) {
        this.list = list;
    }
    //@Override
    public void nhapOto(Scanner in){
        Oto o = new Oto(in.nextLine(), 
                in.nextLine(), 
                Double.parseDouble(in.nextLine()), 
                Integer.parseInt(in.nextLine()), 
                Double.parseDouble(in.nextLine()));
        o.setMa();
        list.add(o);
    }
    //@Override
    public void nhapXeTai(Scanner in){
        XeTai xt = new XeTai(in.nextLine(), 
                in.nextLine(), 
                Double.parseDouble(in.nextLine()), 
                Double.parseDouble(in.nextLine()),
                Boolean.parseBoolean(in.nextLine()));
        xt.setMa();
        list.add(xt);
    }
    //@Override
    public void out(){
        for (PTGT i : list){
            System.out.println(i);
        }
    }
}
