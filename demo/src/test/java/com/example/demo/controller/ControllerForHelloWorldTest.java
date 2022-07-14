package com.example.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class ControllerForHelloWorldTest {
    private static final Logger LOGGER = LogManager.getLogger(ControllerForHelloWorldTest.class);

    @BeforeEach
    void setUp() {

        LOGGER.info( "Test started");
        long startTime = System.currentTimeMillis();
        startTime = System.currentTimeMillis();
        System.out.println("start time is: " + startTime+"ms");
    }


    @Test
     void testControllerForHelloWorldExists() throws ClassNotFoundException {
        //tests whether class exists

            Class a=Class.forName("com.example.demo.controller.ControllerForHelloWorld");


            Assert.assertNotEquals(a,null);

        if (a==null) {
            LOGGER.info("Test failed - class does not exist");
        }else{
            LOGGER.info("Test passed - class exists");
        }

    }



    @Test
    void hello() {
        //tests whether returns correct String
        ControllerForHelloWorld hw=new ControllerForHelloWorld();
        String expected="Hello World";
        assertEquals(hw.getHello(),expected);
        if(hw.getHello()==expected){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }

    }


    @Test
    void helloEmpty() {
        //tests whether returns empty string
        ControllerForHelloWorld hw=new ControllerForHelloWorld();
        String expected = null;
        assertNotEquals(hw.getHello(), expected);
        if(!Objects.equals(hw.getHello(), expected)){
            System.out.println("Test passed - Returning Hello World, not null");
        }else{
            System.out.println("Test failed - returning null");
        }
    }

    @AfterEach
    void tearDown() {

        LOGGER.info( "Test ended");
        long startTime = System.currentTimeMillis();
        startTime = System.currentTimeMillis();
        System.out.println("end time is: " + startTime+"ms");
    }
}