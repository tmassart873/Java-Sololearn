import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}

class Square extends Shape {

    public int squared_area;

    public Square(int x) {

        width = x;
    }

    public void area() {

        squared_area = width*width;
        System.out.println(squared_area) ;

    }
}
class Circle extends Shape {

    public double circle_area;
    public Circle(int y){

        width = y;

    }

    public void area() {
        circle_area = Math.PI * width * width;
        System.out.println(circle_area);
    }
}



public class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}
