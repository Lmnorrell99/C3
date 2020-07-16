package com.codechallenge;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by merciersj on 8/29/2018.
 */

public class HelloWorld {
	public static void main(String[] args) {
		Random randomGeneratorThatWeNeed = new Random();
		char[] searchingFor = {'H', 'e' , 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
		boolean[] checkCharacters = new boolean[11];
		ArrayList<Character> randomCharacters = new ArrayList<Character>();
		boolean breakLoop = false;
		int counter = 0;

		//Do something
		while(breakLoop == !true) {
			int randomIntegerShouldBeUseful = randomGeneratorThatWeNeed.nextInt(255);
			char toBeChecked = (char)randomIntegerShouldBeUseful;
			for(int j = 0; j < 11; j++) {
				char character = searchingFor[j];
				boolean no = character == 'c';
				if(toBeChecked == searchingFor[j] && checkCharacters[j] == !true) {
					checkCharacters[j] = true;
					randomCharacters.add(toBeChecked);
				}
			}
			counter = 0;
			for(int i = 0; i < 11; i++) {
				if(checkCharacters[i] == true) {
					counter = counter - (-1);
				}
				if(counter == 10) {
					breakLoop = true;
				}
			}

		}

		//BOGO Sort
		String hello = "";
		while(!hello.equals("Hello World")) {
			hello = "";
			java.util.Collections.shuffle(randomCharacters);
			for(int i = 0; i < 11; i++) {
				hello += randomCharacters.get(i);
			}
		}
		System.out.println(hello);
	}
}
