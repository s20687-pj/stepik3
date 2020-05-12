import interfejsy.MovablePoint;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovablePointTest {

    MovablePoint test, test2, test3, test4, test5;

    @Before
    public void setUp() {
        test = new MovablePoint(20, 20);
        test2 = new MovablePoint(20, 20);
        test3 = new MovablePoint(10, 30);
        test4 = new MovablePoint();
    }

    @Test
    public void test_moveUp() {
        assertEquals(18, test.moveUp());
        assertNotEquals(20, test.moveUp());
    }

    @Test
    public void test_moveDown() {
        assertEquals(22, test.moveDown());
        assertNotEquals(20, test.moveDown());
    }
    @Test
    public void test_moveLeft() {
        assertEquals(18, test.moveLeft());
        assertNotEquals(20, test.moveLeft());
    }
    @Test
    public void test_moveRight() {
        assertEquals(22, test.moveRight());
        assertNotEquals(20, test.moveRight());
    }
    @Test
    public void test_comparetTo() {
        assertEquals(-1, test.compareTo(test2));
        assertEquals(1, test2.compareTo(test3));
    }

    @Test
    public void test_getX() {
        assertNotNull(test4.getX());
        assertNull(test5);
    }

    @Test
    public void test_equals() {
        assertTrue(test.equals(test2));
        assertFalse(test.equals(test3));
    }


    @After
    public void teardown() {

        test = null;
        test2 = null;
        test3 = null;
        test4 = null;
        test5 = null;
    }
}


