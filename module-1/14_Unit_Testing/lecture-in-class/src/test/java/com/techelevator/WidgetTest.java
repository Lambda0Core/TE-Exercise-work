package com.techelevator;

import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/* Like all other Java code, unit testing code is defined within a class.
 * Each test class will typically contain all of the unit tests for a single
 * "unit" of production code.
 *
 * If the "unit" is a single class from the production code, then the
 * convention is that the test class will belong to the same package as the
 * class under test and the name of the test class is the name of the
 * production class with "Test" at the end.  For example, the test class
 * for the production class "Foo" would be "FooTest"
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WidgetTest {

    /* If a method is annotated with @Before, it will be executed immediately prior to every test.
     * It is intended to be used when there is a repetitive setup (i.e. "Arrange") task that is
     * performed by several tests */
    @Before
    public void setup() {
        System.out.println("setup");
    }

    /* If a method is annotated with @After, it will be executed immediately after every test.
     * It is intended to be used when there is a repetitive cleanup task that is performed by
     * several tests (e.g. deleting temp files, rolling back database transactions, etc) */
    @After
    public void teardown() {
        System.out.println("teardown");
    }

    /* Each test is implemented as a method with the @Test annotation. When the JUnit
     * framework is invoked, it looks for these @Test annotations on the test class
     * and runs such methods as tests.
     *
     * You will notice that the naming convention used in the test methods below
     * deviates from standard Java method naming conventions by using underscores
     * between words instead of camelCase. This is my own personal convention and
     * should not be construed as a general standard or convention. You can also
     * use camelCase for test method names. You should follow the norm at whatever
     * development organization you join.
     *
     * Regardless of whether you use camelCase or underscores, your method names
     * should be very descriptive to the point of being overly verbose. This is fine
     * because you will never write code to invoke your test methods, they are only
     * invoked by the Junit framework, hence descriptive trumps concise.
     *
     * Test methods always:
     *     - are public
     *     - return void
     *     - take no arguments
     */
    @Test
    public void Widget_Add_AddTwoNumbers_ShouldReturnTrue() {

        //Arrange
        Widget widget = new Widget();
        int expectedResult = 3;
        //Act
        int actualResult = widget.add(1, 2);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void Widget_Add_AddTwoCalculations_ShouldReturnTrue() {

        //Arrange
        Widget widget = new Widget();
        int expectedResult = 143;
        //Act
        int actualResult = widget.add((10 * 12), (20 + 13));


        //Assert
        //Assert.assertEquals(expectedResult, actualResult);
        Assert.assertTrue(
                "Your results are the worst.  expectedValue: " + expectedResult + " actualValue: " + actualResult
                , expectedResult == actualResult
        );
    }

    @Test
    public void Widget_Subtract_SubtractTwoNumbers_ShouldReturnTrue() {

        //Arrange
        Widget widget = new Widget();
        int expectedResult = -1;
        //Act
        int actualResult = widget.substract(1, 2);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void Widget_ConcatenateStringArray_ShouldReturnTrue(){

        //Arrange
        Widget widget   = new Widget();
        String[] stringArray = {"First", "Second"};
        String expectedResult = "FirstSecond";
        //Act
        String actualResult = widget.concatenate(stringArray);

        //Assert
        Assert.assertEquals("Strings should be equal", expectedResult, actualResult);

    }
}

