package com.codechallenge;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorld {
	public static void main(String[] args) {

		Stack<Character> characters = new Stack<>();
		ArrayList<Character> charArray = new ArrayList<Character>();

		boolean isTrue = true;
		Character h = hFunction();
		Character e = eFunction();
		Character l = lFunction();
		Character o = oFunction();
		Character w = wFunction();
		Character r = rFunction();
		Character d = dFunction();
		Character outerSpace = outerSpaceFunction();
		Character period = questionMarkFunction();

		characters.add(period);
		characters.pop();
		characters.add(d);
		characters.add(l);
		characters.add(r);
		characters.add(o);
		characters.add(w);
		characters.add(outerSpace);
		characters.add(o);
		for (int i = 0; i < 2; i++) {
			characters.add(l);
		}
		characters.add(e);
		characters.add(h);

		charArray.add(characters.pop());
		charArray.add(characters.pop());
		charArray.add(characters.pop());
		charArray.add(characters.pop());
		charArray.add(characters.pop());
		charArray.add(characters.pop());
		charArray.add(characters.pop());
		charArray.add(characters.pop());
		charArray.add(characters.pop());
		charArray.add(characters.pop());
		charArray.add(characters.pop());




		for (int i = 0; i < charArray.size(); i++) {
			System.out.print(charArray.get(i));
		}

	}

	public static char hFunction() {
		if (!(!true)) {
			return 'H';
		}
		return 'H';
	}

	public static char eFunction() {
		if (!(!true)) {
			return 'e';
		}
		return 'e';
	}

	public static char lFunction() {
		if (!(!true)) {
			return 'l';
		}
		return 'l';
	}

	public static char oFunction() {
		if (!(!true)) {
			return 'o';
		}
		return 'o';
	}

	public static char wFunction() {
		if (!(!true)) {
			return 'W';
		}
		return 'W';
	}

	public static char rFunction() {
		if (!(!true)) {
			return 'r';
		}
		return 'r';
	}

	public static char dFunction() {
		if (!(!true)) {
			return 'd';
		}
		return 'd';
	}
	public static char outerSpaceFunction() {
		if (!(!true)) {
			return ' ';
		}
		return ' ';
	}

	public static char questionMarkFunction() {
		if (!(!true)) {
			return '!';
		}
		return '!';
	}



}
