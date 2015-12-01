package Jv.calc.Calculate;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Владимир on 30.11.2015.
 */
public class CalculatorTest {

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAdd() throws Exception {

        Calculator calc = new Calculator();
        calc.add(1,1);
        Assert.assertEquals(2,calc.getResult());

    }

    @Test
    public void testSub() throws Exception {

        Calculator calc = new Calculator();
        calc.sub(2,1);
        Assert.assertEquals(1,calc.getResult());

    }
    @Test
    public void testDiv() throws Exception {

        Calculator calc = new Calculator();
        calc.div(8, 4);
        Assert.assertEquals(2,calc.getResult());

    }

    @Test
    public void testMult() throws Exception {

        Calculator calc = new Calculator();
        calc.mult(2, 5);
        Assert.assertEquals(10,calc.getResult());

    }

    @Test
    public void testClearResult() throws Exception {

        Calculator calc = new Calculator();
        calc.clearResult();
        Assert.assertEquals(0,calc.getResult());
    }

    @Test
    public void testAdd1() throws Exception {
        Calculator calc = new Calculator();
        calc.add(5);
        Assert.assertEquals(5,calc.getResult());
        calc.add(5);
        Assert.assertEquals(10,calc.getResult());
    }

    @Test
    public void testSub1() throws Exception {
        Calculator calc = new Calculator();
        calc.sub(3);
        Assert.assertEquals(-3,calc.getResult());
        calc.sub(2);
        Assert.assertEquals(-5,calc.getResult());

    }

    @Test
    public void testDiv1() throws Exception {

        Calculator calc = new Calculator();
        calc.result = 10;
        calc.div(2);
        Assert.assertEquals(5,calc.getResult());

    }
    @Test(expected = IllegalArgumentException.class)
    public void testDivException() throws UserException {
        Calculator calc = new Calculator();
        calc.result = 10;
        calc.div(0);
    }

    @Test
    public void testMult1() throws Exception {
        Calculator calc  = new Calculator();
        calc.result = 6;
        calc.mult(4);
        Assert.assertEquals(24,calc.getResult());

    }

    @Test
    public void testSetSaveResult() throws Exception {
        Calculator calc = new Calculator();
        calc.setSaveResult("yes");
        Assert.assertEquals(true,calc.saveResult);
        calc.setSaveResult("no");
        Assert.assertEquals(false,calc.saveResult);
    }
}