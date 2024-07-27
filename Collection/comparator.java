
package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
import java.util.List;

public class comparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            String id = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine()); // dung sc.nextLine() het de k phai xu ly troi
            list.add(new SinhVien(id, ten, lop, gpa));   
        }
        // C1: Anonymous inner class
//        Collections.sort(list, new Comparator<SinhVien>(){
//            @Override
//            public int compare(SinhVien o1, SinhVien o2) {  //o1 > 02 return 1, = return 0, < return -1
//                 return o1.getHoTen().compareTo(o2.getHoTen());
//            }       
//        });      

        // C2: bieu thuc lambda
        //Collections.sort(list, (SinhVien o1, SinhVien o2)->o1.getHoTen().compareTo(o2.getHoTen()));
        Collections.sort(list, (SinhVien o1, SinhVien o2)->(o1.getHoTen() != o2.getHoTen() ? o1.getHoTen().compareTo(o2.getHoTen()) 
                : o1.getMaSinhVien().compareTo(o2.getMaSinhVien()) ));
        
        // C3 implements 
        //Collections.sort(list, new SortByGpaThenByName());
        
        for (SinhVien x : list) {
            System.out.println(x);
        }
    }
}
