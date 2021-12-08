package uet.oop.bomberman.entities.movableEntities;

import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.graphics.Sprite;

import java.awt.*;

public class Bomber extends AnimatedEntities {
    private KeyCode direction;

    public Bomber(int x, int y, Image img) {
        super(x, y, img);
        layer = 1;
    }

    @Override
    public void update() {
        if (direction == KeyCode.LEFT) {
            goLeft();
            img = Sprite.movingSprite(Sprite.player_left, Sprite.player_left_1, Sprite.player_left_2, left++, 40).getFxImage();
        }
        if (direction == KeyCode.RIGHT) {
            goRight();
            img = Sprite.movingSprite(Sprite.player_right, Sprite.player_right_1, Sprite.player_right_2, right++, 40).getFxImage();
        }
        if (direction == KeyCode.UP) {
            goUp();
            img = Sprite.movingSprite(Sprite.player_up, Sprite.player_up_1, Sprite.player_up_2, up++, 40).getFxImage();
        }
        if (direction == KeyCode.DOWN) {
            goDown();
            img = Sprite.movingSprite(Sprite.player_down, Sprite.player_down_1, Sprite.player_down_2, down++, 40).getFxImage();
        }
    }

    public void KeyPressedEvent(KeyCode keyCode) {
        if (keyCode == KeyCode.LEFT || keyCode == KeyCode.RIGHT || keyCode == KeyCode.UP || keyCode == KeyCode.DOWN) {
            direction = keyCode;
        }
    }

    public void KeyReleasedEvent(KeyCode keyCode) {
        if (direction == keyCode) {
            if (direction == KeyCode.LEFT) {
                img = Sprite.player_left.getFxImage();
            }
            if (direction == KeyCode.RIGHT) {
                img = Sprite.player_right.getFxImage();
            }
            if (direction == KeyCode.UP) {
                img = Sprite.player_up.getFxImage();
            }
            if (direction == KeyCode.DOWN) {
                img = Sprite.player_down.getFxImage();
            }
        }
        direction = null;
    }

    @Override
    public Rectangle bound() {
        return new Rectangle(newX + 4, newY + 4, Sprite.SCALED_SIZE - 12, Sprite.SCALED_SIZE * 3 / 4);
    }

    public boolean collide(Entity e) {
        return e.collide(this);
    }
}
