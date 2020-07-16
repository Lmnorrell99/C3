package com.codechallenge;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorldTest {
    private final ByteArrayOutputStream outcontent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private final String[] args = {};

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outcontent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void out() {
        HelloWorld.main(args);
        assertEquals("Hello World", outcontent.toString().trim());
    }

    @Test
    public void hTest() {
        HelloWorld.main(args);
        assertEquals('H', HelloWorld.hFunction());
    }

    @Test
    public void eTest() {
        HelloWorld.main(args);
        assertEquals('e', HelloWorld.eFunction());
    }

    @Test
    public void lTest() {
        HelloWorld.main(args);
        assertEquals('l', HelloWorld.lFunction());
    }

    @Test
    public void oTest() {
        HelloWorld.main(args);
        assertEquals('o', HelloWorld.oFunction());
    }

    @Test
    public void spaceTest() {
        HelloWorld.main(args);
        assertEquals(' ', HelloWorld.outerSpaceFunction());
    }

    @Test
    public void wTest() {
        HelloWorld.main(args);
        assertEquals('W', HelloWorld.wFunction());
    }

    @Test
    public void rTest() {
        HelloWorld.main(args);
        assertEquals('r', HelloWorld.rFunction());
    }

    @Test
    public void dTest() {
        HelloWorld.main(args);
        assertEquals('d', HelloWorld.dFunction());
    }
    @Test
    public void periodTest() {
        HelloWorld.main(args);
        assertEquals('!', HelloWorld.questionMarkFunction());
    }
}
