package com.im.object2;

public class Object2Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method4 m4 = new Method4();
		Member member = new Member();
		member.name = "iu";
		member.age = 30;
		member.email = "iu@naver.com";
		
		Member member1 = new Member();
		member1.name = "ou";
		member1.age = 20;
		member1.email = "ou@naver.com";
		
		Member member2 = new Member();
		member2.name = "su";
		member2.age = 10;
		member2.email = "su@naver.com";
		
		Member [] member3 = new Member[3];
		member3[0] = member;
		member3[1] = member1;
		member3[2] = member2;
		
		m4.info(member3);
		
		System.out.println(member3.length);
		
	}

}
