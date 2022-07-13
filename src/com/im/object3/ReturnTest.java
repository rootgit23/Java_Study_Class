package com.im.object3;

import java.util.Random;
import java.util.Scanner;

public class ReturnTest {
	
	//makeAccount
	//title,host,numbers,balance 입력받아서 리턴
	Account ac = new Account();
	Scanner sc = new Scanner(System.in);
	public Account makeAccount() {
		System.out.println("은행을 입력하세요");
		String a = sc.next();
		ac.title = a;
		System.out.println("소유주를 입력하세요");
		ac.host = sc.next();
		System.out.println("계좌번호를 입력하세요");
		ac.numbers = sc.next();
		System.out.println("잔액을 입력하세요");
		ac.balance = sc.nextLong();
		return ac;
	}
	
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
