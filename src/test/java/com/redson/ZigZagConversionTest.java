package com.redson;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by 1109806 on 2020-07-20.
 */
public class ZigZagConversionTest {

    @Test
    public void test() {
        ZigZagConversion z = new ZigZagConversion();
        assertEquals(z.convert("PAYPALISHIRING", 3), "PAHNAPLSIIGYIR");
    }
}
