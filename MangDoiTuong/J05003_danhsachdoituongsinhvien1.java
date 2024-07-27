
package MangDoiTuong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class sv1{
    private String maSV = "B20DCCN", ten, dob, lop;
    private double gpa;
    public static int sMa = 1;

    public sv1(String ten, String lop, String dob, double gpa) {
        this.ten = ten;
        this.dob = dob;
        this.lop = lop;
        this.gpa = gpa;
        this.maSV += String.format("%03d", sMa++);
    }
    
    public void chuanHoa() throws ParseException{
        SimpleDateFormat ip = new SimpleDateFormat("d/M/yyyy");
        SimpleDateFormat op = new SimpleDateFormat("dd/MM/yyyy");
        Date d = ip.parse(this.dob);
        this.dob = op.format(d);
    }
    
    @Override
    public String toString(){
        try {
            chuanHoa();
        } catch (ParseException ex) {
            Logger.getLogger(sv1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.maSV + " " + this.ten + " " + this.lop + " " + this.dob + " " + String.format("%.2f", this.gpa);
    }
}

public class J05003_danhsachdoituongsinhvien1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<sv1> a = new ArrayList<>();
        while (n-- > 0){
            a.add(new sv1(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        for (sv1 i : a){
            System.out.println(i);
        }
    }
}
