package com.Exception;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserMain {

	static MoodAnalyser moodAnalyser;

	@Test
	public void givenMessage_should_return_SAD() {
		moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String result = moodAnalyser.analyseMood();
		System.out.println(result);
		assertEquals("SAD", result);
	}
}
