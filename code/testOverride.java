class Yuan {
    static int z = 5;
    int r;
    String name;

    Yuan(int r) {
        this.r = r;
    }

    int a() {
        return z * r * r;
    }

    int p() {
        return 5 * z * r;
    }

    void value() {
        name = "china";
    }
}


class testOverride extends Yuan {
    int h;
    String name;

    testOverride(int r, int h1) {
        super(r);
        h = h1;
    }

    int a() {
        value();

        return (2 * super.a()) + (p() * h);
    }

    void value() {
        super.value();
        name = "America";
        System.out.println("\"" + this.name + "\"");
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        Yuan y = new Yuan(4);
        Yuan yz = new testOverride(5, 2);
        System.out.println(y.a());
        System.out.println(yz.p());
        System.out.println(yz.a());
    }
}
