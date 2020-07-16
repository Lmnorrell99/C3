package com.codechallenge;

import org.junit.Test;

import static com.codechallenge.Main.*;
import static org.junit.Assert.assertEquals;

public class SubmitTest {

    @Test
    public void test_2() {


    }

    @Test
    public void test_exclamation() {
        assertEquals("!", exclamation());
    }

    @Test
    public void test_d() {
        assertEquals("d!", d());
    }

    @Test
    public void test_l3() {
        assertEquals("ld!", l3());
    }

    @Test
    public void test_r() {
        assertEquals("rld!", r());
    }

    @Test
    public void test_o2() {
        assertEquals("orld!", o2());
    }

    @Test
    public void test_w() {
        assertEquals("World!", w());
    }

    @Test
    public void test_space() {
        assertEquals(" World!", space());
    }

    @Test
    public void test_o() {
        assertEquals("o World!", o());
    }

    @Test
    public void test_l2() {
        assertEquals("lo World!", l2());
    }

    @Test
    public void test_l1() {
        assertEquals("llo World!", l1());
    }

    @Test
    public void test_e() {
        assertEquals("ello World!", e());
    }

    @Test
    public void test_h() {
        assertEquals("Hello World!", h());
    }
}