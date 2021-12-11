package uet.oop.bomberman.entities.staticEntities;

import javafx.scene.image.Image;
import uet.oop.bomberman.entities.Entity;

public abstract class Item extends Entity {
    public Item(int x, int y, Image img) {
        super(x, y, img);
        layer = 1;
    }

    @Override
    public void update() {

    }

    @Override
    public boolean collide(Entity e) {
        return true;
    }
}