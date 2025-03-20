package Bai_Tap_tuan_9.Bai3;

public class ResizableCircle  extends Circle implements Resizable{
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                "radius=" + radius +
                '}';
    }

    public double resize(int percent) {
        radius*= percent / 100.0;
        return radius;
    }
}
