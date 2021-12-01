package com.Exception;

public class MoodAnalysisException extends Exception {
	public exceptionType type;

	public MoodAnalysisException(exceptionType type, String message) {
		super(message);
		this.type = type;
	}

	enum exceptionType {
		ENTERD_NULL, ENTERED_EMPTY
	}
}
