package com.techelevator;

import WIdgets.Widget;
import org.junit.Assert;
import org.junit.Test;

public class WidgetTest {

    @Test
    public void Widget_Subtract_SubtractTwoCalculations_ShouldReturnTrue(){

        //arrange
        Widget widget = new Widget();
        int expectedResult = -1;
        //act
        int actualResult = widget.substract(1, 2);


        //assert
        Assert.assertEquals(expectedResult, actualResult);
        Assert.assertTrue("Your results are the worst", expectedResult == actualResult);
    }

    @Test
    public void Widget_ConcatenateStringArray_ShouldReturnTrue(){

        //arrange
        Widget widget = new Widget();
        String[] stringArray = {"First", "Second"};
        //act
        widget.concatenate(stringArray);
        String expectedResult = "FirstSecond";
        String actualResult = widget.concatenate(stringArray);
        //assert
        Assert.assertEquals("Array should be equal", expectedResult, actualResult);
    }
}
