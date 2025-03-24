package LabTuan5.Bai4;

import Bai_Tap_tuan_9.Bai2.Moveable;
import Bai_Tap_tuan_9.Bai2.MoveableCircle;

public class MoveablePoint extends MoveableCircle implements Moveable {
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        System.out.println("Current position : " + this);
        y+=ySpeed;
        System.out.println("After move : " + this);
    }

    @Override
    public void moveDown() {
        System.out.println("Current position : " + this);
        y-=ySpeed;
        System.out.println("After move : " + this);
    }

    @Override
    public void moveLeft() {
        System.out.println("Current position : " + this);
        x-=xSpeed;
        System.out.println("After move : " + this);
    }

    @Override
    public void moveRight() {
        System.out.println("Current position : " + this);
        x+=xSpeed;
        System.out.println("After move : " + this);
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
