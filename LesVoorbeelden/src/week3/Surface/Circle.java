package week3.Surface;

public class Circle extends Shape {
    /* ====== Public part ======*/
    /* --- Methods --- */
    public Circle (float x, float y, float radius) {
        super (x, y);
        this.radius = radius;
    }

    public float getArea () {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void draw() {
        for (float angleInDegrees = 0; angleInDegrees < 360; angleInDegrees += angleStepsizeInDegrees) {
            float angleInRadians = (float) Math.toRadians (angleInDegrees);
            drawPointRelative (radius * (float) Math.cos (angleInRadians), radius * (float) Math.sin (angleInRadians));
        }
    }

    /* ====== Protected part ======*/
    /* --- Fields --- */
    protected float radius;
    protected static final float angleStepsizeInDegrees = 0.01f;

}
