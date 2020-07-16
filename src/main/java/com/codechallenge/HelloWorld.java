package com.codechallenge;

/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorld {
	public static void main(String[] args) {

		String aksjndf = "";
		String corona = "";
		H h = null;

		// ho
		for (int i = 0; i < 1; ++i) {
			h = new H("h");
			aksjndf += h.toString();
		}

		E e = null;
		for (int i = 0; i < 1; ++i) {
			e = new E("E");
		}
		L l = null;
		for (int i = 0; i < 1; ++i) {
			l = new L("L");
		}
		O o = null;
		for (int i = 0; i < 1; ++i) {
			o = new O('O');
		}

		W w = null;
		for (int i = 0; i < 1; ++i) {
			w = new W("W");
			aksjndf += w.toString();
		}

		R r = null;
		for (int i = 0; i < 1; ++i) {
			r = new R("R");
			corona += r.toString();
		}

		D d = null;
		int i = 100;
		while (i < 101) {
			d = new D();
			i++;
		}

		aksjndf = aksjndf.substring(0, 1).toUpperCase() + e.toString().toLowerCase() + l.toString().toLowerCase() + l.toString().toLowerCase() + aksjndf.substring(1, 2).toLowerCase();
		corona = o.toString().toUpperCase() + w.toString().toLowerCase() + corona.substring(0, 1).toLowerCase() + l.toString().toLowerCase() + d.toString().toLowerCase();

		String virus = aksjndf + " " + corona;

		System.out.println(virus);
	}
}
