package com.tws.refactoring.extract_method;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
//        System.out.print("hello");
//        assertEquals("hello", outContent.toString());
    }

    @Test
    public void should_return_owing_when_input_two_order_and_name_is_apple(){
        //given
        OwingPrinter owingPrinter = new OwingPrinter();
        Order firstOrder = new Order(10);
        Order secondOrder = new Order(15);
        List<Order> orderList = new ArrayList<>();

        orderList.add(firstOrder);
        orderList.add(secondOrder);

        //when
        owingPrinter.printOwing("apple", orderList);
        String expectedResult = "*****************************\n" +
                "****** Customer totals ******\n" +
                "*****************************\n" +
                "name: apple\n" +
                "amount: 25.0\n";

        //then
        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void should_return_owing_when_input_two_order_amount_is_zero_and_name_is_apple(){
        //given
        OwingPrinter owingPrinter = new OwingPrinter();
        Order firstOrder = new Order(0);
        Order secondOrder = new Order(0);
        List<Order> orderList = new ArrayList<>();

        orderList.add(firstOrder);
        orderList.add(secondOrder);

        //when
        owingPrinter.printOwing("apple", orderList);
        String expectedResult = "*****************************\n" +
                "****** Customer totals ******\n" +
                "*****************************\n" +
                "name: apple\n" +
                "amount: 0.0\n";

        //then
        assertEquals(expectedResult, outContent.toString());
    }
}