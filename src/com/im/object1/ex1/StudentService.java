package com.im.object1.ex1;

import java.util.Scanner;

public class StudentService {
	
	//findStudent
	//검색하고싶은 학생의 번호를 입력받습니다
	public Student findStudent(Student [] st3) {
		System.out.println("검색하고 싶은 학생의 번호를 입력하세요");
		int a = sc.nextInt();
		int b = 0;
		for(int j=0; j<st3.length; j++) {
			if(st3[j].num == a) {
				b = j;
				return st3[b];
			}
		}
		return null;
	}
	
	//makeStudents
	//학생수를 입력받고 학생의 정보를 입력 그 학생들을 리턴
	Scanner sc = new Scanner(System.in);
	public Student[] makeStudents() {
		System.out.println("학생수를 입력해주세요");
		int a = sc.nextInt();
		Student [] st = new Student[a];
		for(int i=0; i<st.length; i++) {
			st[i] = new Student();
			System.out.println(i+1 + "번째 학생을 입력하세요");
			st[i].name = sc.next();
			System.out.println(i+1 + "번째 학생의 번호를 입력하세요");
			st[i].num = sc.nextInt();
			System.out.println(i+1 + "번째 학생의 국어점수를 입력하세요");
			st[i].kor = sc.nextInt();
			System.out.println(i+1 + "번째 학생의 영어점수를 입력하세요");
			st[i].eng = sc.nextInt();
			System.out.println(i+1 + "번째 학생의 수학점수를 입력하세요");
			st[i].math = sc.nextInt();
			st[i].total = st[i].kor + st[i].eng + st[i].math;
			System.out.println(i+1 + "번째 학생의 총점 : " + st[i].total);
			st[i].avg = st[i].total / 3.0;
			System.out.println(i+1 + "번째 학생의 평균 : " + st[i].avg);
		}
		return st;
	}
}
