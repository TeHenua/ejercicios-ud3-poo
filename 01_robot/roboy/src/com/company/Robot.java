package com.company;

/**
 * Created by TeHenua on 09/01/2017.
 */
public class Robot {
    private int x = 0;
    private int y = 0;

    public Robot(){}
    public void mover(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
