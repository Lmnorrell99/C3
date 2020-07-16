package com.codechallenge;

import org.junit.Test;

public class BcT {
	@Test
	public void baseTest() {
		String msg = "Hello World";
		for(int i = 0; i < msg.length(); i++){
			char c = msg.charAt(i);
			String num = String.valueOf((int)c);
			String s = Bc.bC(num, 10, 2 + i);

			System.out.println(c + " : " + s);
		}
	}

}