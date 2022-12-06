package entity;

import engine.DrawManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BulletTest {

    Bullet bullet;

    @BeforeEach
    void setUp() {
        bullet = new Bullet(1, 1, 1,0);
        assertNotNull(bullet);
    }

    @AfterEach
    void tearDown() {
        bullet = new Bullet(1, 1, 1,1);
    }

    @Test
    void setSprite() {
        bullet.setSpeed(-1);
        bullet.setSprite();
        assertSame(bullet.spriteType, DrawManager.SpriteType.Bullet);

    }

    @Test
    void update() {
        bullet.update();
        assertEquals(1, bullet.getPositionX());
        assertEquals(2, bullet.getPositionY());
    }

    @Test
    void movePosX() {
        bullet.setSpeed(0);
        assertEquals(1, bullet.getPositionX());
    }

    @Test
    void setSpeed() {
        bullet.setSpeed(2);
        assertEquals(2, bullet.getSpeed());
    }

    @Test
    void getSpeed() {
        assertEquals(1, bullet.getSpeed());
    }

}