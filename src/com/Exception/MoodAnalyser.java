package com.Exception;

import java.util.Scanner;

import javax.annotation.processing.Messager;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.length() == 0)
				throw new MoodAnalysisException(MoodAnalysisException.exceptionType.ENTERED_EMPTY,
						"Enter the valid mood");
			if (message.toLowerCase().contains("sad")) {
				message = "SAD";
			} else {
				message = "HAPPY";
			}
			return message;
		} catch (NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.exceptionType.ENTERD_NULL, "Enter the valid mood");
		}
	}

}