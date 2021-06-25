package com.codechallenge;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorld {

	public static void main(String[] args) {

		/**
		 * Please be patient.
		 *
		 * She works (probably)
		 */

//		System.out.print("Enter a number between 1 and 100:");
//
//		int i = (int)Math.random() * (100) + 1;
//		System.out.println("i is:" + i);
//		int userNum = 0;
//		Scanner scanner = new Scanner(System.in);
//		userNum = scanner.nextInt();
//		System.out.println(userNum);
//
//		while(userNum != i) {
//
//			if(userNum < i) {
//				System.out.println("number too low, try again");
//			} else if (userNum > i){
//				System.out.println("number too high, try again");
//			} else {
//				break;
//			}
//
//			userNum = scanner.nextInt();
//			System.out.println(userNum);
//		}

		char[] alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		String returnString = "";

		for (int a = 0; a < 52; a++){
			for (int b = 0; b < 52; b++){
				for (int c = 0; c < 52; c++) {
					for (int d = 0; d < 52; d++) {
						for (int e = 0; e < 52; e++) {
							for (int f = 0; f < 52; f++) {
								for (int g = 0; g < 52; g++) {
									for (int h = 0; h < 52; h++) {
										for(int i = 0; i < 52; i++) {
											for (int j = 0; j < 52; j++) {
												for (int k = 0; k < 52; k++) {
													returnString = "" + alphabet[a] + alphabet[b] + alphabet[c] + alphabet[d] + alphabet[e] + alphabet[f] + alphabet[g] + alphabet[h] + alphabet[i] + alphabet[j] + alphabet[k];
													if (returnString.equals("Hello World")) {
														System.out.println(returnString);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}
}
