package com.im.object2;

public class Method4 {
	//멤버들의 정보를 출력하는 info 메서드
	public void info(Member [] member3) {
		for(int i=0; i<member3.length; i++) {
			System.out.println(member3[i].name);
			System.out.println(member3[i].age);
			System.out.println(member3[i].email);
		}
		
		member3 = new Member[2];
	}
}
