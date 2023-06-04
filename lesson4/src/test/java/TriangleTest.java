import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    void test() throws MyException {
        ExampleClass exampleClass = new ExampleClass();
        Assertions.assertEquals(2, exampleClass.triangle(3, 3, 2));
    }
}
