/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.Comparator;

/**
 *
 * @author DELL 7510
 */
public class SortByGpa implements Comparator<SinhVien>{
    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        if (o1.getGpa() > o2.getGpa()) return 1;
        else if(o1.getGpa() < o2.getGpa()) return -1;
        else return 0;
    }
}
