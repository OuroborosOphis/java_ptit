package KhaiBaoLopVaDoiTuong;

import java.util.Scanner;

class Point {

    private double x, y;
    
    public Point(){
    }
    
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public double distance(Point p) {
        double x0 = this.x - p.x;
        double y0 = this.y - p.y;
        return Math.sqrt(x0 * x0 + y0 * y0);
    }
    
    public double distance(Point a, Point b){
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
    
}

public class J04009_areaTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        while (t-- > 0) {
            Point a = new Point(input.nextDouble(), input.nextDouble());
            Point b = new Point(input.nextDouble(), input.nextDouble());
            Point c = new Point(input.nextDouble(), input.nextDouble());           

            double ab = a.distance(b), bc = b.distance(c), ca = c.distance(a);
            if(ab + bc <= ca || bc + ca <= ab || ab + ca <= bc){
                System.out.println("INVALID");
            }else{
                System.out.printf("%.2f\n", Math.sqrt((ab + bc + ca) * (ab + bc - ca) * ( - ab + bc + ca) * ( ab - bc + ca)) / 4);
            }
        }
    }
}
