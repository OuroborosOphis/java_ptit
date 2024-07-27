
package J04010;


public class Point {
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
