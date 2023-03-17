public class Komplex {
    double a;
    double b;


    public Komplex(double v, double v1) {
        a = v;
        b = v1;
    }

    @Override
    public String toString() {
        return a+b+"i";
    }

    public Komplex add(Komplex b) {
        return null;
    }

    public Komplex multiply(Komplex b) {
        return null;
    }

    public double arg() {
        return 0;
    }
}
