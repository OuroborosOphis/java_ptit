
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


class Time{
    private int hour, minute, second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public int amount(){
        return this.hour * 3600 + this.minute * 60 + this.second;
    }
    
    @Override
    public String toString(){
        return this.hour + " " + this.minute + " " + this.second;
    }

}


public class J05033_sapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> a = new ArrayList<>();
        for (int i = 0; i < n; i++){
            a.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a, new Comparator<Time>(){
            @Override
            public int compare(Time o1, Time o2){
                if (o1.amount() > o2.amount()) return 1;
                else return -1;
            }
        });
        for (Time i : a){
            System.out.println(i);
        }
    }
}
