import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {

    @BeforeEach
    void setUp() {
        System.out.println("This is the before test");
    }

    @Test
    void getApple() {
        Apples apple = new Apples();
        assertEquals("apple", apple.getApple());
    }
}