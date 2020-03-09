package week2.Vormen;

import java.lang.Math;

public class Ellips extends Vorm {
    double r;
    double r2;

    public Ellips() {
        r = 0;
        r2 = 0;
        circumference = 0;
        surface = 0;
    }

    public Ellips(double r, double r2) {
        this.r = r;
        this.r2 = r2;
        doMath();
    }

    @Override
    double calcCircumference() {
        System.out.println(circumference = 2*Math.PI*Math.sqrt((r*r+r2*r2)/2));
        return circumference;
    }

    @Override
    double calcSurface() {
        System.out.println(surface = Math.PI*r*r2);
        return surface;
    }
}
