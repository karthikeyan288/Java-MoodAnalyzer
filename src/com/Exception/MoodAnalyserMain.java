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
		moodAnalyser = new MoodAnalyser("I am in sad Mood");
		String result = moodAnalyser.analyseMood();
		System.out.println(result);
		assertEquals("SAD", result);
	}

	@Test
	public void givenMessage_should_return_HAPPY() {
		moodAnalyser = new MoodAnalyser("I am in happy Mood");
		String result = moodAnalyser.analyseMood();
		System.out.println(result);
		assertEquals("HAPPY", result);
	}
}
