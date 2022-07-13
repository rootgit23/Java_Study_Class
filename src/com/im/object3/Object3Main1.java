package com.im.object3;

import java.util.Scanner;

public class Object3Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTest rt = new ReturnTest();
		rt.info();
		int num = rt.makeRandom();
		System.out.println(num);
		
		System.out.println("------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		int [] num1 = rt.makeRandom2(a);
		for(int i=0; i<num1.length; i++) {
			System.out.println(num1[i]);
		}
		
		System.out.println("-------------------------");
		
		Account ac = rt.makeAccount();
		System.out.println(ac.title);
		System.out.println(ac.host);
		System.out.println(ac.numbers);
		System.out.println(ac.balance);
	}

}
