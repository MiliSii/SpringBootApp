package com.example.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitSetUp {


        @Test

        public void testAdd() {
            String str = "Junit is working fine";
            assertEquals("Junit is working fine",str);
        }
    }

