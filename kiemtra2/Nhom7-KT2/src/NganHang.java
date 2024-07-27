
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class NganHang implements ChucNang{
    private List<GiaoDich> list;

    public NganHang() {
        list=new ArrayList<>();
        GiaoDichVang v=new GiaoDichVang("2/2/2022", 200, 10, "9999");
        v.setMa();
        list.add(v);
        v=new GiaoDichVang("21/9/2023", 120, 8, "24K");
        v.setMa();
        list.add(v);
        GiaoDichTT t=new GiaoDichTT("5/5/2022", 300, 3, 23, "USD");
         t.setMa();
        list.add(t);
        t=new GiaoDichTT("25/5/2023", 300, 13, 27, "EU");
        t.setMa();
        list.add(t);
        t=new GiaoDichTT("5/5/2023", 300, 30, 1, "VND");
        t.setMa();
        list.add(t);
    }

    public List<GiaoDich> getList() {
        return list;
    }

    public void setList(List<GiaoDich> list) {
        this.list = list;
    }

    
    
    @Override
    public void nhapGDVang(Scanner in) {
        GiaoDichVang v=new GiaoDichVang(
                in.nextLine(),
                Double.parseDouble(in.nextLine()),
                Integer.parseInt(in.nextLine()),
                in.nextLine());
        v.setMa();
        list.add(v);
    }

    @Override
    public void nhapGDTT(Scanner in) {
        GiaoDichTT t=new GiaoDichTT();
        t.setNgay(in.nextLine());
        t.setGia(Double.parseDouble(in.nextLine()));
        t.setSoluong(Integer.parseInt(in.nextLine()));
        String loai=in.nextLine();
        t.setLoaiTien(loai);
        double tg;
        if(loai.equalsIgnoreCase("VND")){
            tg=1;
        }else{
            tg=Double.parseDouble(in.nextLine());
        }
        t.setTigia(tg);
        t.setMa();
        list.add(t);
    }

    @Override
    public void out() {
        for(GiaoDich i:list){
            System.out.println(i);
        }
    }

    @Override
    public void xoa(String ma) {
        int t=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma)){
                t++;
                System.out.println(list.remove(i));
                break;
            }
        }
//        for(GiaoDich k:list){
//            if(k.getMa().equalsIgnoreCase(ma)){
//                //tim thay
//                t++;
//                list.remove(k);
//                System.out.println("xoa thanh cong!!!");
//                break;
//            }
//        }
        if(t==0){
            System.out.println("thay dau ma xoa");
        }
    }

    @Override
    public void suaVang(String ma, Scanner in) {
        List<GiaoDichVang> lVang=new ArrayList<>();
        //loc vang
        for(GiaoDich k:list){
            if(k instanceof GiaoDichVang){
                lVang.add((GiaoDichVang)k);
            }
        }
        int t=0;
        for (int i = 0; i < lVang.size(); i++) {
            if(lVang.get(i).getMa().equalsIgnoreCase(ma)){
                t++;
                GiaoDichVang v=lVang.get(i);
                System.out.println(v);
                //nhap sua
                v.setNgay(in.nextLine());
                v.setGia(Double.parseDouble(in.nextLine()));
                v.setSoluong(Integer.parseInt(in.nextLine()));
                v.setLoaiVang(in.nextLine());
                
                System.out.println(v);
                System.out.println("sua thanh cong");
            }
        }
        if(t==0){
            System.out.println("Khong tim thay");
        }
        
    }

    @Override
    public void timVangTheoLoai(String loaiVang) {
        List<GiaoDichVang> lVang=new ArrayList<>();
        //loc vang
        for(GiaoDich k:list){
            if(k instanceof GiaoDichVang){
                lVang.add((GiaoDichVang)k);
            }
        }
        int t=0;
        for (int i = 0; i < lVang.size(); i++) {
            if(lVang.get(i).getLoaiVang().equalsIgnoreCase(loaiVang)){
                t++;
                GiaoDichVang v=lVang.get(i);               
                System.out.println(v);
            }
        }
        if(t==0){
            System.out.println("Khong tim thay");
        }
        
    }

    @Override
    public void timVangTheoThanhTien(double tu, double den) {
        List<GiaoDichVang> lVang=new ArrayList<>();
        //loc vang
        for(GiaoDich k:list){
            if(k instanceof GiaoDichVang){
                lVang.add((GiaoDichVang)k);
            }
        }
        int t=0;
        for (int i = 0; i < lVang.size(); i++) {
            if(lVang.get(i).getThanhTien() >= tu && lVang.get(i).getThanhTien() <= den){
                t++;
                GiaoDichVang v=lVang.get(i);               
                System.out.println(v);
            }
        }
        if(t==0){
            System.out.println("Khong tim thay");
        }
        
    }

    @Override
    public int demGDTTTheoLoaiTien(String loaiTien) {
        List<GiaoDichTT> lVang=new ArrayList<>();
        //loc vang
        for(GiaoDich k:list){
            if(k instanceof GiaoDichTT){
                lVang.add((GiaoDichTT)k);
            }
        }
        int t=0;
        for (int i = 0; i < lVang.size(); i++) {
            if(lVang.get(i).getLoaiTien().equalsIgnoreCase(loaiTien)){
                t++;                
            }
        }
        return t;
    }

    @Override
    public double tongTienGDTheoNam(int nam) {
        double tong = 0;
        String s = String.valueOf(nam);
        for (GiaoDich x : list){
            if (x.getNgay().substring(4).equalsIgnoreCase(s)){
                if (x instanceof GiaoDichTT) tong += ((GiaoDichTT) x).getThanhTien();
                else if (x instanceof GiaoDichVang) tong += ((GiaoDichVang) x).getThanhTien();
            }
        }
        return tong;
    }

    @Override
    public void sapxepTheoMa() {
        Collections.sort(list, new Comparator<GiaoDich>(){
            @Override
            public int compare(GiaoDich o1, GiaoDich o2) {
                // tang dan
                return o1.getMa().compareToIgnoreCase(o2.getMa());
                // giam dan
                //return o2.getMa().compareToIgnoreCase(o1.getMa());
            }
            
        });
    }

    @Override
    public void sapxepTheoSoLuong() {
        list.sort(new Comparator<GiaoDich>(){
            @Override
            public int compare(GiaoDich o1, GiaoDich o2) {
                // giam dan
                //return o2.getSoluong() - o1.getSoluong();
                return Integer.compare(o2.getSoluong(), o1.getSoluong());
            }
            
        });
    }

    @Override
    public void sapxepVangTheoThanhTien() {
        // lay vang ra
        List<GiaoDichVang> lVang = new ArrayList<>();
        for (GiaoDich k : list){
            if (k instanceof GiaoDichVang){
                lVang.add((GiaoDichVang) k);
            }
        }
        lVang.sort(new Comparator<GiaoDichVang>(){
            @Override
            public int compare(GiaoDichVang o1, GiaoDichVang o2) {
                return Double.compare(o1.getThanhTien(), o2.getThanhTien());
            }
            
        });
        for (GiaoDichVang i :lVang){
            System.out.println(i);
        }
    }
    
    // tang dan
    @Override
    public void sapxepTTTheoGia() {
        List<GiaoDichTT> lVang = new ArrayList<>();
        for (GiaoDich k : list){
            if (k instanceof GiaoDichTT){
                lVang.add((GiaoDichTT) k);
            }
        }
        lVang.sort(new Comparator<GiaoDichTT>(){
            @Override
            public int compare(GiaoDichTT o1, GiaoDichTT o2) {
                return Double.compare(o1.getThanhTien(), o2.getThanhTien());
            }
            
        });
        for (GiaoDichTT i :lVang){
            System.out.println(i);
        }
    }
    
    // ngay moi len tren cu xuong duoi - giam dan
    @Override
    public void sapxepTTTheoNgay() {
        List<GiaoDichTT> lVang = new ArrayList<>();
        for (GiaoDich k : list){
            if (k instanceof GiaoDichTT){
                lVang.add((GiaoDichTT) k);
            }
        }
        lVang.sort(new Comparator<GiaoDichTT>(){
            @Override
            public int compare(GiaoDichTT o1, GiaoDichTT o2) {
                String s1 = o1.getNgay();
                String s2 = o2.getNgay();
                return s1.compareToIgnoreCase(s2);
            }
            
        });
        for (GiaoDichTT i :lVang){
            System.out.println(i);
        }
    }
    
}
