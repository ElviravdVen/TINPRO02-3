package week3;

public class Rechthoekige_driehoek implements Vorm {
    private int l;
    private int b;
    public Rechthoekige_driehoek(int a, int b) {
        this.l = a;
        this.b = b;
    }

    @Override
    public int berekenOpp(int a, int b) {
        return a * b * 1/2;
    }

    @Override
    public double berekenOmtr(int a, int b) {
        double c = Math.sqrt((a*a + b*b));
        return a+b+c;
    }
}
