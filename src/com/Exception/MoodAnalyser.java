package com.Exception;

import java.util.Scanner;

import javax.annotation.processing.Messager;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}

	public String analyseMood() {
		try {
			if (message.toLowerCase().contains("sad")) {
				message = "SAD";
			} else {
				message = "HAPPY";
			}
			return message;
		} catch (NullPointerException e) {
			message = "HAPPY";
			System.out.println(e.getMessage());
			return message;
		}
	}

}