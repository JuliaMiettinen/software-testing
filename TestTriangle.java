package gradle;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;


public class TestTriangle {
    @Test
    @DisplayName("Scalene Triangle")
    public void test1() {
        Triangle myTriangle = new Triangle();
        assertEquals("Scalene Triangle", myTriangle.checkTriangle(8, 7, 9));
        
    }

    @Test
    @DisplayName("Equilateral Triangle")
    public void test2() {
        Triangle myTriangle = new Triangle();
        assertEquals("Equilateral Triangle", myTriangle.checkTriangle(100, 100,  100));

    }

    @Test
    @DisplayName("Isosceles Triangle")
    public void test3() {
    Triangle myTriangle = new Triangle();
    assertEquals("Isosceles Triangle", myTriangle.checkTriangle(1, 100, 100));
    }

    @Test
    @DisplayName("Isosceles Triangle")
    public void test4() {
    Triangle myTriangle = new Triangle();
    assertEquals("Isosceles Triangle", myTriangle.checkTriangle(100, 1, 100));
    }

    @Test
    @DisplayName("Isosceles Triangle")
    public void test5() {
    Triangle myTriangle = new Triangle();
    assertEquals("Isosceles Triangle", myTriangle.checkTriangle(100, 100, 1));
    }

    @Test
    @DisplayName("Isosceles Triangle")
    public void test6() {
    Triangle myTriangle = new Triangle();
    assertEquals("Isosceles Triangle", myTriangle.checkTriangle(2, 100, 100));
    }

    @Test
    @DisplayName("Isosceles Triangle")
    public void test7() {
    Triangle myTriangle = new Triangle();
    assertEquals("Isosceles Triangle", myTriangle.checkTriangle(100, 2, 100));
    }

    @Test
    @DisplayName("Isosceles Triangle")
    public void test8() {
    Triangle myTriangle = new Triangle();
    assertEquals("Isosceles Triangle", myTriangle.checkTriangle(100, 100, 2));
    }

    @Test
    @DisplayName("NotATriangle")
    public void test9() {
    Triangle myTriangle = new Triangle();
    assertEquals("NotATriangle", myTriangle.checkTriangle(200, 100, 100));
    }

    @Test
    @DisplayName("NotATriangle")
    public void test10() {
    Triangle myTriangle = new Triangle();
    assertEquals("NotATriangle", myTriangle.checkTriangle(100, 200, 100));
    }

    @Test
    @DisplayName("NotATriangle")
    public void test11() {
    Triangle myTriangle = new Triangle();
    assertEquals("NotATriangle", myTriangle.checkTriangle(100, 100, 200));
    }

    @Test
    @DisplayName("Isosceles Triangle")
    public void test12() {
    Triangle myTriangle = new Triangle();
    assertEquals("Isosceles Triangle", myTriangle.checkTriangle(199, 100, 100));
    }

    @Test
    @DisplayName("Isosceles Triangle")
    public void test13() {
    Triangle myTriangle = new Triangle();
    assertEquals("Isosceles Triangle", myTriangle.checkTriangle(100, 199, 100));
    }

    @Test
    @DisplayName("Isosceles Triangle")
    public void test14() {
    Triangle myTriangle = new Triangle();
    assertEquals("Isosceles Triangle", myTriangle.checkTriangle(100, 100, 199));
    }

    @Test
    @DisplayName("Not permitted")
    public void test15() {
    Triangle myTriangle = new Triangle();
    assertEquals("Value of x, y, or z is not in the range of permitted values.", myTriangle.checkTriangle(0, 0, 0));
    }

    @Test
    @DisplayName("NotATriangle")
    public void test16() {
    Triangle myTriangle = new Triangle();
    assertEquals("NotATriangle", myTriangle.checkTriangle(90, 100, 200));
    }

    @Test
    @DisplayName("Scalene Triangle")
    public void test17() {
        Triangle myTriangle = new Triangle();
        assertEquals("Scalene Triangle", myTriangle.checkTriangle(150, 140, 100));
    }

    @Test
    @DisplayName("Not permitted")
    public void test18() {
    Triangle myTriangle = new Triangle();
    assertEquals("Value of x, y, or z is not in the range of permitted values.", myTriangle.checkTriangle(0, 10, 15));
    }

    @Test
    @DisplayName("Not permitted")
    public void test19() {
    Triangle myTriangle = new Triangle();
    assertEquals("Value of x, y, or z is not in the range of permitted values.", myTriangle.checkTriangle(10, 0, 15));
    }

    @Test
    @DisplayName("Not permitted")
    public void test20() {
    Triangle myTriangle = new Triangle();
    assertEquals("Value of x, y, or z is not in the range of permitted values.", myTriangle.checkTriangle(10, 15, 0));
    }

}
