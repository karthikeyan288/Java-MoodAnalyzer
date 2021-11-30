package com.Exception;

import java.util.Scanner;

import javax.annotation.processing.Messager;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}

	public void analyseMood() {
		if (message.contains("sad")) {
			System.out.println("SAD");
		} else {
			System.out.println("HAPPY");
		}
	}
}