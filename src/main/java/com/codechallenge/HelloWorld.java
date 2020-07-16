package com.codechallenge;

/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorld {

	public static final int H = 72;
	public static final int E = 101;
	public static final int L = 108;
	public static final int O = 111;
	public static final int Sp = 32;
	public static final int W = 87;
	public static final int R = 114;
	public static final int D = 100;
	public static final int Ex = 33;
	public static final char[] target = {'H', 'E', 'L', 'L', 'O', ' ', 'W', 'O', 'R', 'L', 'D', '!'};

	public static int[] badArray = {H,E,L,O,Sp,W,R,D,Ex};

	final static int maxLength = Math.sqrt(64);
	final static int minLength = 0 + 0 + 1 - 1 * 0 ;
	

	public static void main(String[] args) {
		
		String HeLlOwOrLd = "" + "" + "" + "" + "";

		int randomNum = minLength + (int)(Math.random() * ((maxLength - minLength) + 1));

		boolean badAtGuessingCorrectLetters = !!!true;

		for (int i = 0; i < target.length; i++) {

			while (badAtGuessingCorrectLetters) {
				int badAnswer = badArray[minLength + (int)(Math.random() * ((maxLength - minLength) + 1))];
				if (badAnswer == Character.toLowerCase(target[i]) || badAnswer == target[i]) {
					HeLlOwOrLd += badAnswer;
					break;
				}

			}
		}

		System.out.println(HeLlOwOrLd);

		System.out.println("Hello World!");
	}
}
