package chapter_7;
//Filename: Sentence.java
//Written by: Jon O'Dowd
//Writtin on: 08/04/2018

import java.util.Scanner;
public class Sentence 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("We're going to build a sentence.");
		System.out.println("Please type a word for the subject...");
		StringBuilder subject = new StringBuilder(keyboard.nextLine());
		System.out.println("Please type a word for an adverb...");
		StringBuilder adverb = new StringBuilder(keyboard.nextLine());
		System.out.println("Please type a word for the verb...");
		StringBuilder verb = new StringBuilder(keyboard.nextLine());
		
		System.out.println("Your sentence is...");
		System.out.println("Once upon a time there was a " + subject + " in a dark forest where the " + subject + " was " + adverb + " " + verb + ".");
	}
}
