package LabTuan5.Bai4;

import Bai_Tap_tuan_9.Bai2.Moveable;
import Bai_Tap_tuan_9.Bai2.MoveablePoint;

public class MoveableCircle implements Moveable {
    public int radius;
    public MoveablePoint center;

    public MoveableCircle(int radius, MoveablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    public MoveableCircle() {

    }


    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MoveableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
