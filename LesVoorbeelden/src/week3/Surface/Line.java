package week3.Surface;

public class Line extends Shape {
    /* ====== Public part ======*/
    /* --- Methods --- */
    public Line (float x, float y, float length, Boolean vertical) {
        super (x, y);
        this.length = length;
        this.vertical = vertical;
    }
    @Override
    public void draw() {
        int halfLength = (int) length / 2;
        if (vertical) { // Move out of inner loop for speed
            for (int deltaLength = -halfLength; deltaLength <= halfLength; deltaLength++) {
                drawPointRelative(0, deltaLength);
            }
        }
        else {
            for (int deltaLength = -halfLength; deltaLength <= halfLength; deltaLength++) {
                drawPointRelative (deltaLength, 0);
            }
        }
    }

    /* ====== Protected part ======*/
    /* --- Fields --- */
    protected float length;
    protected boolean vertical;
}
