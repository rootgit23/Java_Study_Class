package com.im.object2;

public class AnimalSound {
	public void dogSound() {
		System.out.println("멍멍");
		catSound();
	}
	
	public void catSound() {
		System.out.println("냥냥");
		dogSound();
	}
	
	public void tigerSound() {
		System.out.println("어흥");
	}
}
