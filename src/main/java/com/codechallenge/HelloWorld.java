package com.codechallenge;

/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorld {
	public static void main(String[] args) {
		H h = new H("H");
		E e = new E("E");
		L l = new L("L");
		O o = new O('O');
		W w = new W("W");
		R r = new R("R");
		D d = new D();

		String hello = h.toString() + e.toString() + l.toString() + l.toString() + o.toString();
		String world = w.toString() + o.toString() + r.toString() + l.toString() + d.toString();

		String helloWorld = hello + " " + world;

		System.out.println(helloWorld);
	}
}
