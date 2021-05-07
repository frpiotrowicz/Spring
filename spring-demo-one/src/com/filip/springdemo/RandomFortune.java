package com.filip.springdemo;

import java.util.Random;

public class RandomFortune implements FortuneService {

	private String[] fortune = {"lucky", "unlucky", "fuc*ed" };
	@Override
	public String getFortune() {
		String random = (fortune[new Random().nextInt(fortune.length)]);
		return "You are " + random;
		
	}

}
