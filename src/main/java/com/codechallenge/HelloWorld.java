package com.codechallenge;
//
//import Node;
//import CharGenerator;
import java.util.Random;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by merciersj on 8/29/2018.
 */

//@SpringBootApplication
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("TEST");
		Node n = new Node((new CharGenerator()).getChar());
		System.out.println(n.toString());
		//SpringApplication.run(HelloWorld.class, args);
	}
}

 class Node{
	private char value;
	private Node head;
	private Node tail;

	public Node(){

	}

	public Node(char value){
		this.value = value;
	}

	public String toString(){
		return "" + value;
	}
}

 class CharGenerator {
	private char c;
	private Random r;

	public CharGenerator(){
		this.r = new Random();
		this.c = (char)(r.nextInt(26) + 'a');
	}

	public char getChar(){
		return this.c;
	}
}