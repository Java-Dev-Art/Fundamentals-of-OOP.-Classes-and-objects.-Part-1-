import org.junit.Assert;
import org.junit.Test;

public class TestTriangle {
    int expected;
    int sideA;
    int sideB;
    int sideC;
    Triangle triangle;

    @Test
    public void testPerimeter() {
        sideA = 3;
        sideB = 5;
        sideC = 6;
        expected = 14;
        triangle = new Triangle(sideA, sideB, sideC);
        Assert.assertEquals(expected, triangle.getPerimeter());
    }

    @Test
    public void testArea() {
        sideA = 3;
        sideB = 5;
        sideC = 6;
        double expectedAr = 7.48;//
        triangle = new Triangle(sideA, sideB, sideC);
        Assert.assertEquals(expectedAr, triangle.geronArea(), 0.001);
    }
}
