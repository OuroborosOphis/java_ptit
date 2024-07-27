/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

// sap xep theo gpa

import java.util.Comparator;

// neu cung gpa thi ten co thu tu tu dien nho hon sap len truoc
public class SortByGpaThenByName implements Comparator<SinhVien>{
    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        if(o1.getGpa() != o2.getGpa()) {
            if (o1.getGpa() > o2.getGpa()) return 1;
            else return -1;
        }
        else {
            return o1.getHoTen().compareTo(o2.getHoTen());
        }
    }
}
