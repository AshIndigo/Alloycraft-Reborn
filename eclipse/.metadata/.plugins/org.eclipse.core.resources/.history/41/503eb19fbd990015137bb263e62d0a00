package com.ashindigo.test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomObjectGenerator {

	static Scanner scanner = new Scanner(System.in);
	public static int mode = 0;
	static Random rand = new Random();
	static ArrayList word = new ArrayList();
	static ArrayList alphabet = new ArrayList();
	
	public static void main(String[] args) {
		
		run();
	}

	public static void run() {
		// Generator selector code
		System.out.println("What generator would you like to use today?");
		System.out.println("Random Number Generator = 0");
		System.out.println("Random Word Generator = 1");
		System.out.println("Coin Flipper = 2");
		System.out.println("Range Generator = 3");
		mode  = scanner.nextInt();
		// if and switch block to get the generator to load
		if(mode < 4)
		switch (mode){
		case 0: numbergen(); break;
		case 1: wordgen(); break;
		case 2: coingen(); break;
		case 3: rangegen(); break;
		} else {
			System.out.println("Invalid Mode");
			run();
		}
		
	}

	// Method to generate a random number
	public static void numbergen() {
		int result = 0;
		int length = 0;
		System.out.println("Enter the length of the number or enter zero for random length");
		length = scanner.nextInt();
		if (length != 0){
		int runtime = 0;
		ArrayList numb = new ArrayList();
		while(runtime < length){
			numb.add(rand.nextInt(10));
			runtime++;
		}
	    String numbb = numb.toString().replaceAll("\\D","");
	    Long.parseLong(numbb);
		System.out.println(numbb);
		} else {
			result = rand.nextInt();
			System.out.println(result);
		}
	}

	// Method to generate a random word
	public static void wordgen() {
		genertateAlphabet();
		int result = 0;
		int length = 0;
		// Get the length of the word
		System.out.println("Length of word?");
		length = scanner.nextInt();
		int runtime = 0;
		// Get the word made
		try {
		while(runtime < length){
			result = rand.nextInt(24);
			word.add(alphabet.get(result));
			runtime++;
		}
		String wordd = String.join("", word);
		System.out.println("Here is your random word. Have Fun!");
		System.out.println(wordd);
	}
	catch (IndexOutOfBoundsException e){
		e.printStackTrace();
	}
	}
	
	public static void coingen() {
		System.out.println("You flip the coin.");
		boolean side = rand.nextBoolean();
		if (side == true){
			System.out.println("It's heads.");
		} else {
			System.out.println("It's tails.");
		}
		
	}
	
	public static void rangegen() {
		
		int maxnumb;
		int minnumb;
		int result;
		System.out.println("Please select the mininum number");
		minnumb = scanner.nextInt();
		System.out.println("Please select the maxinum number");
		maxnumb = scanner.nextInt();
		result = ThreadLocalRandom.current().nextInt(minnumb, maxnumb);
		System.out.println("Here is your number");
		System.out.println(result);
	}

	// I am not sorry for this
	private static void genertateAlphabet() {
		alphabet.add("a");
		alphabet.add("b");
		alphabet.add("c");
		alphabet.add("d");
		alphabet.add("e");
		alphabet.add("f");
		alphabet.add("g");
		alphabet.add("h");
		alphabet.add("i");
		alphabet.add("j");
		alphabet.add("k");
		alphabet.add("l");
		alphabet.add("m");
		alphabet.add("o");
		alphabet.add("p");
		alphabet.add("q");
		alphabet.add("r");
		alphabet.add("s");
		alphabet.add("t");
		alphabet.add("u");
		alphabet.add("w");
		alphabet.add("x");
		alphabet.add("y");
		alphabet.add("z");
	}

}
