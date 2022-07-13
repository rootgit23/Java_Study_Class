package com.im.object1.ex1;

import java.util.Scanner;

public class StudentController {
	public void start() {
		Scanner  sc = new Scanner(System.in);
		boolean check=true;
	    Student [] st = null;
	    Student st1 = null;
		while(check) {
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 조회");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 학생 정보 추가");
			System.out.println("6. 프로 그램 종료");
			int select= sc.nextInt();
			switch (select) {
			case 1: 
				System.out.println("1");
				StudentService ss = new StudentService();
				st = ss.makeStudents();
				break;
			case 2 :
				System.out.println("2");
				StudentView sv = new StudentView();
				sv.view(st);
				System.out.println("문자열 입력");
				String s = sc.next();
				sv.view(s);
				break;
			case 3 :
				System.out.println("3");
				StudentService ss1 = new StudentService();
				st1 = ss1.findStudent(st);
				StudentView sv2 = new StudentView();
				sv2.view(st1);
				break;
			case 4 :
				System.out.println("4");
				break;
			case 5 :
				System.out.println("5");
				break;
			default:
				System.out.println("종료중");
				check=!check;
			}
		}
		
		
	}
}
