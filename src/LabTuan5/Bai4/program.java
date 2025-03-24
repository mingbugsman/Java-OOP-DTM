package LabTuan5.Bai4;

import Bai_Tap_tuan_9.Bai2.MoveableCircle;
import Bai_Tap_tuan_9.Bai2.MoveablePoint;

public class program {
    public static void main(String[] args) {
        Bai_Tap_tuan_9.Bai2.MoveablePoint p = new MoveablePoint(0,0, 1, 1);
        Bai_Tap_tuan_9.Bai2.MoveableCircle moveableCircle = new MoveableCircle(5, p);
        moveableCircle.moveRight();
        moveableCircle.moveRight();
        moveableCircle.moveLeft();
    }
}
