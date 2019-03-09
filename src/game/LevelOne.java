package game;

import city.cs.engine.BoxShape;
import org.jbox2d.common.Vec2;

public class LevelOne extends GameLevel {

    @Override
    public void populate(Game game, int playerHealth) {
        super.populate(game, playerHealth);

        Platform ground = new Platform(this, new BoxShape(11, 0.5f), 0, -11.5f);
        ground.addCollisionListener(super.getCollisionHandler());
    }

    @Override
    public Vec2 startPosition() {
        return new Vec2(0, -9);
    }

    @Override
    public Vec2 bonePosition() {
        return new Vec2(8, -8);
    }
}
