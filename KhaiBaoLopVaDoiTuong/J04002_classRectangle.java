
package KhaiBaoLopVaDoiTuong;

import java.util.Scanner;

class Rectange {
    int width;
    int height;
    String color;
    
    void input(Scanner input) {
        this.width = input.nextInt();
        this.height = input.nextInt();
        String s = input.next();
        this.color = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }
    
    boolean check() {
        if (this.width <= 0|| this.height <= 0) {
            return false;
        } else {
            return true;
        }
    }
    
    int findArea() {
        return this.width * this.height;
    }
    
    int findPerimeter() {
        return (this.width + this.height) * 2; 
    }
    
 
}


public class J04002_classRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Rectange hcn = new Rectange();
        
        hcn.input(input);
        if (hcn.check()) {
                    System.out.printf(hcn.findPerimeter()+ " " + hcn.findArea()+ " " + hcn.color);
        } else {
            System.out.println("INVALID");
        }
    }
}
