package com.im.object1.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		/*Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		st1.name = "루트";
		st1.num = 1;
		st1.kor = 1;
		st1.eng = 2;
		st1.math = 3;
		st1.total = 6;
		st1.avg = 2.0;
		*/
		Student st = null;
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student[3];
		for (int i=0; i<3; i++) {
			st = new Student();
			System.out.println("이름 입력");
			st.name = sc.next();
			students[i] = st;
		}
		
		System.out.println(students[0].name);
		System.out.println(students[1].name);
		System.out.println(students[2].name);
		
		System.out.println(st.name);
		
		System.out.println("프로그램 종료");
	}

}
