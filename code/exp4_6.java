import java.util.*;
import java.math.*;

interface Shape {
    public abstract double area();
}

class Triangle implements Shape{
    double a, b, c;
    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double area(){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}

class Rectangle implements Shape{
    double width, length;
    Rectangle(double w, double l){
        this.width = w;
        this.length = l;
    }
    public double area(){
        return width * length;
    }
}

class Circle implements Shape{
    double r;
    Circle(double r){
        this.r = r;
    }
    public double area(){
        return Math.PI * r * r;
    }
}

public class exp4_6 {
    public static void main(String[] args) {
        Shape[] threeShape = new Shape[3];
        threeShape[0] = new Triangle(5, 3, 4);
        threeShape[1] = new Rectangle(5, 5);
        threeShape[2] = new Circle(4);
        for (int i = 0; i < 3; i++){
            double value = threeShape[i].area();
            System.out.println(value);
        }
    }
}