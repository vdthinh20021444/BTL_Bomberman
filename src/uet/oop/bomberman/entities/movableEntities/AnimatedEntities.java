package uet.oop.bomberman.entities.movableEntities;

import javafx.scene.image.Image;
import uet.oop.bomberman.entities.Entity;

public abstract class AnimatedEntities extends Entity {
    protected int newX = x;
    protected int newY = y;
    protected int speed;
    protected int left = 0;
    protected int right = 0;
    protected int up = 0;
    protected int down = 0;

    public AnimatedEntities(int x, int y, Image img) {
        super(x,y,img);
    }

    public void goLeft() {
        newX = x - speed;
    }

    public void goRight() {
        newX = x + speed;
    }
    public void goUp() {
        newY = y - speed;
    }

    public void goDown() {
        newY = y + speed;
    }
    public void move() {
        x = newX;
        y = newY;
    }
    public void stay() {
        newX = x;
        newY = y;
    }

    public int getNewX() {
        return newX;
    }

    public int getNewY() {
        return newY;
    }
}