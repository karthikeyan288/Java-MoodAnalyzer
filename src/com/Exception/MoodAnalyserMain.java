package com.Exception;

import java.util.Scanner;

public class MoodAnalyserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the message :");
		String message = sc.nextLine();
		MoodAnalyser moodAnalyser = new MoodAnalyser(message);
		moodAnalyser.analyseMood();
	}
}
