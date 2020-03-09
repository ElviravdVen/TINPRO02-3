package week2.Vormen;

public class Vorm {
    double surface;
    double circumference;

    public Vorm() {
        surface = 0;
        circumference = 0;
    }

    double calcCircumference() {
        System.out.println(circumference);
        return circumference;
    }

    double calcSurface() {
        System.out.println(surface);
        return surface;
    }

    void doMath() {
        calcCircumference();
        calcSurface();
    }

}
