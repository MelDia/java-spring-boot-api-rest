package com.meldia.valorantapirest.util;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogUtil {
	
	public static void logText(String text) {
		
		String logger = textLenght(text);
		
	}

	private static String textLenght(String message) {
		String pattern = "//////";
		
		for(int i = 0; i < message.length() + 2; i++) {
			pattern += "/";
		}
		pattern = "//////";
		return pattern;
	}
}
