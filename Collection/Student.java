
package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Student {
    private String id, name, className, email;

    public Student(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.className + " " + this.email;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            list.add(new Student(ma, name, lop, email));           
        }
        Collections.sort(list, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getClassName().equals(o2.getClassName()))
                    return o1.getId().compareTo(o2.getId());
                else return o1.getClassName().compareTo(o2.getClassName());
            }
        });
        for (Student x : list) {
            System.out.println(x);
        }
    }
}
