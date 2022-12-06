package engine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FrameTest {
    int width, height;
    Frame frame;

    @BeforeEach
    void setUp() {
        width = 200;
        height = 200;
        frame = new Frame(width, height);
    }

    @Test
    void setScreen() {
        assertNotNull(frame);
    }

    @Test
    void getWidth() {
        assertEquals(width, frame.getWidth());
    }

    @Test
    void getHeight() {
        assertEquals(height-28, frame.getHeight());
    }
}