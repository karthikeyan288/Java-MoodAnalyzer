package com.Exception;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserMain {

	static MoodAnalyser moodAnalyser;
	Scanner sc = new Scanner(System.in);

	@Test
	public void givenMessage_should_return_SAD() {
	    String message = "I am in Sad Mood";
		moodAnalyser = new MoodAnalyser(message);
		String result = moodAnalyser.analyseMood();
		System.out.println(result);
		assertEquals("SAD", result);
	}
}
