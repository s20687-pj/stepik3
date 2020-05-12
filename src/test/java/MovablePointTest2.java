import interfejsy.MovablePoint;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class MovablePointTest2 {

    private int inputNumber;
    private int expectedResult;
    MovablePoint test;

    @Before
    public void setUp() {
        test = new MovablePoint(inputNumber,inputNumber);
    }

    public MovablePointTest2(int inputNumber, int expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                { 10, 12 },
                { 12, 14 },
                { 14, 16 },
                { 16, 18 },
                { 18, 20 }
        });
    }

    @Test
    public void test_moveUp() {
        System.out.println("Parameterized Number is : " + inputNumber);
        assertEquals(expectedResult, test.moveUp());
    }

    @After
    public void teardown() {
        test = null;
    }
}
