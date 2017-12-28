import java.util.*;
import java.lang.Math.*;

public class Circle {
    int x,y,r;
    public Circle() {
        x = y = r = 0;
    }

    public Circle(int x , int y , int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    double zc() {
        return 2 * Math.PI * r;
    }

    double mj() {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(0,0,3);
        System.out.println(c1.zc());
        System.out.println(c1.mj());
    }
}