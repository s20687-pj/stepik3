package interfejsy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class MovablePoint implements Movable, Comparable{

    private int x;
    private int y;
    private int xSpeed =2;
    private int ySpeed = 2;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;

    }
    public MovablePoint() {
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public int moveUp() {

        return this.x += this.xSpeed;
    }

    public int  moveDown() {

        return this.x += this.xSpeed;
    }

    public int moveLeft() {

        return this.y -= this.ySpeed;
    }

    public int moveRight() {

        return this.y += this.ySpeed;
    }

    @Override
    public int compareTo(Object t)
    {
        if(t instanceof MovablePoint)
        {
            MovablePoint s = (MovablePoint)t;
            if (this.x > s.x ){
                return 1;
            }
            else return  -1;
        }
        else
            return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovablePoint that = (MovablePoint) o;
        return x == that.x &&
                y == that.y &&
                xSpeed == that.xSpeed &&
                ySpeed == that.ySpeed;
    }

}
