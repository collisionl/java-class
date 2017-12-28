import java.util.*;

public class Complex {
    int realPart;
    int maginPart;
    public Complex(){
        realPart = 0;
        maginPart = 0;
    }
    public Complex(int r,int i) {
        this.realPart = r;
        this.maginPart = i;
    }
    public Complex complexAdd(Complex a) {
        int r = this.realPart + a.realPart;
        int i = this.maginPart + a.maginPart;
        return new Complex(r,i);
    }
    public String toString() {
        return new String(this.realPart+"+"+this.maginPart+"i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(1,2);
        Complex c2 = new Complex(3,4);
        System.out.println(c1.complexAdd(c2).toString());
    }
}

// 1+2i 和3+4i 相加产生一个新的复数 4+6i 