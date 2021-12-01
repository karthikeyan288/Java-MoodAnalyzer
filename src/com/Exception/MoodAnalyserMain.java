package com.Exception;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserMain {

	static MoodAnalyser moodAnalyser;
	Scanner sc = new Scanner(System.in);

	@Test
	public void givenMessage_should_return_SAD() {
		moodAnalyser = new MoodAnalyser("I am in sad Mood");
		try {
			String result = moodAnalyser.analyseMood();
			System.out.println(result);
			assertEquals("SAD", result);
		} catch (MoodAnalysisException ex) {

		}
	}

	@Test
	public void givenMessage_should_return_HAPPY() {
		moodAnalyser = new MoodAnalyser("I am in happy Mood");
		try {
			String result = moodAnalyser.analyseMood();
			System.out.println(result);
			assertEquals("HAPPY", result);
		} catch (MoodAnalysisException ex) {

		}
	}

	@Test
	public void givenMessage_withNull_should_return_HAPPY() {
		moodAnalyser = new MoodAnalyser(null);
		try {
			String result = moodAnalyser.analyseMood();
			System.out.println(result);
			assertEquals("HAPPY", result);
		} catch (MoodAnalysisException ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void givenMessage_withEmptyString_should_return_HAPPY() {
		moodAnalyser = new MoodAnalyser("");
		try {
			String result = moodAnalyser.analyseMood();
			System.out.println(result);
			assertEquals("HAPPY", result);
		} catch (MoodAnalysisException ex) {
			ex.printStackTrace();
		}
	}
}
