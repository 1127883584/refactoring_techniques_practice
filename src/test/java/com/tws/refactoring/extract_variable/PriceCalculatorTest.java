package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorTest {
    @Test
    public void should_return_5100_when_quantity_is_500_and_itemPrice_is_10(){
        //given
        PriceCalculator priceCalculator = new PriceCalculator();

        //when
        double actualResult = priceCalculator.getPrice(500, 10);
        double exceptedResult = 5100;

        //then
        assertEquals(exceptedResult, actualResult, 0.0);

    }

    @Test
    public void should_return_2100_when_quantity_is_200_and_itemPrice_is_10(){
        //given
        PriceCalculator priceCalculator = new PriceCalculator();

        //when
        double actualResult = priceCalculator.getPrice(200, 10);
        double exceptedResult = 2100;

        //then
        assertEquals(exceptedResult, actualResult, 0.0);

    }

    @Test
    public void should_return_2100_when_quantity_is_600_and_itemPrice_is_10(){
        //given
        PriceCalculator priceCalculator = new PriceCalculator();

        //when
        double actualResult = priceCalculator.getPrice(600, 10);
        double exceptedResult = 6050;

        //then
        assertEquals(exceptedResult, actualResult, 0.0);

    }

}