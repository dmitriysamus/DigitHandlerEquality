import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DigitHandlerTest {
    DigitHandler handler0;
    DigitHandler handler1;
    DigitHandler handler2;

    @BeforeEach
    void init() {
        handler0 = new DigitHandler(4);
        handler1 = new DigitHandler(4);
        handler2 = new DigitHandler(1);
    }

    @AfterEach
    void clean() {
        handler0 = null;
        handler1 = null;
        handler2 = null;
    }

    /**
     * Проверяется работа метода hashCode().
     * Ожидается, что на hashCode влияет только значение value.
     */
    @Test
    void hashCode_Test() {
        Assert.assertEquals(handler0.hashCode(), handler1.hashCode());
        Assert.assertNotEquals(handler0.hashCode(), handler2.hashCode());
        Assert.assertNotEquals(handler1.hashCode(), handler2.hashCode());
    }

    /**
     * Проверяется работа метода equals().
     * Ожидается, что сравнивается только значение value.
     */
    @Test
    void equals_Test() {
        Assert.assertEquals(handler0, handler1);
        Assert.assertNotEquals(handler0, handler2);
        Assert.assertNotEquals(handler1, handler2);
    }


}
