package chap_07;


public class Study722_723 {
    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
        System.out.println("면적의 합 : "+sumArea(arr));
    }
    private static double sumArea(Shape[] arr){
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i].calcArea();
        }
        return sum;
    }
}

abstract class Shape {
    Point p;

    Shape(){
        this(new Point(0, 0));
    }
    Shape(Point p){
        this.p = p;
    }

    abstract double calcArea();

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }

}
class Point {
    int x;
    int y;

    Point(){
        this(0, 0);
    }

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}
class Circle extends Shape{
    double r;

    Circle() {
    }

    Circle(double r) {
        this.r = r;
    }

    @Override
    double calcArea() {
        return Math.PI * r * r;
    }
}
class Rectangle extends Shape {

    double width;
    double height;

    Rectangle() {

    }

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    double calcArea() {
        return width * height;
    }

    boolean isSquare(){
        return width == height ? true : false;
    }
}