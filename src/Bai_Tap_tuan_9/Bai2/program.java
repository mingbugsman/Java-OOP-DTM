package Bai_Tap_tuan_9.Bai2;

public class program {
    public static void main(String[] args) {
        MoveablePoint p = new MoveablePoint(0,0, 1, 1);
        MoveableCircle moveableCircle = new MoveableCircle(5, p);
        moveableCircle.moveRight();
        moveableCircle.moveRight();
        moveableCircle.moveLeft();
    }
}
