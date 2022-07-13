package com.im.object3;

import java.util.Random;

public class ReturnTest {
	
	//메서드 호출시 숫자를 받아서 그 숫자만큼 랜던한수를 뽑아서 리턴
	public int[] makeRandom2(int num) {
		Random random = new Random();
		int [] om = new int [num];
		for(int i=0; i<om.length; i++) {
			om[i] = random.nextInt(50);
		}
		return om;
	}
	
	public int makeRandom() {
		Random random = new Random();
		int num = random.nextInt(50);
		return num;
	}
	
	public void info() {
		System.out.println("실행 후 그냥 종료");
	}
}
