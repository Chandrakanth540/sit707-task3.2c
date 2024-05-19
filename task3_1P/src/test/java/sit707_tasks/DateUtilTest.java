package sit707_tasks;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilTest {

    @Test
    public void testStudentIdentity() {
        String studentId = "S223798216";
        Assert.assertNotNull("Student ID is ", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Chandrakanth";
        Assert.assertNotNull("Student name is ", studentName);
    }

    @Test
    public void testIncrementLastDayOfJanuary() {
        DateUtil date = new DateUtil(31, 1, 2021);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }

    @Test
    public void testIncrementLastDayOfFebruaryLeapYear() {
        DateUtil date = new DateUtil(29, 2, 2020);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(3, date.getMonth());
    }

    @Test
    public void testIncrementLastDayOfFebruaryNonLeapYear() {
        DateUtil date = new DateUtil(28, 2, 2021);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(3, date.getMonth());
    }

    @Test
    public void testIncrementLastDayOfApril() {
        DateUtil date = new DateUtil(30, 4, 2021);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(5, date.getMonth());
    }

    @Test
    public void testIncrementLastDayOfDecember() {
        DateUtil date = new DateUtil(31, 12, 2021);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2022, date.getYear());
    }

    @Test
    public void testDecrementFirstDayOfMarchLeapYear() {
        DateUtil date = new DateUtil(1, 3, 2020);
        date.decrement();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }

    @Test
    public void testDecrementFirstDayOfMarchNonLeapYear() {
        DateUtil date = new DateUtil(1, 3, 2021);
        date.decrement();
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }

    @Test
    public void testDecrementFirstDayOfMay() {
        DateUtil date = new DateUtil(1, 5, 2021);
        date.decrement();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(4, date.getMonth());
    }

    @Test
    public void testDecrementFirstDayOfJanuary() {
        DateUtil date = new DateUtil(1, 1, 2021);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(2020, date.getYear());
    }

    @Test
    public void testDecrementSecondDayOfFebruaryLeapYear() {
        DateUtil date = new DateUtil(2, 2, 2020);
        date.decrement();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }
}
