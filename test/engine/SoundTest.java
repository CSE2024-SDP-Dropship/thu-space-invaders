package engine;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SoundTest {
    Sound sound;
    String musicName;
    @BeforeEach
    void setUp() {
        sound = new Sound();
        musicName = "Bgm/";

    }

    @AfterEach
    void tearDown() {
        musicName = "";
    }

    @Test
    void playSound() {
        musicName += "movingSpeed.wav";
        sound.playSound(musicName);
    }
}