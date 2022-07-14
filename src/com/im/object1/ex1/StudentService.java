package com.im.object1.ex1;

import java.util.Scanner;

public class StudentService {
	Scanner sc1;
	public StudentService() {
		sc1 = new Scanner(System.in);
	}
	
	//addStudent
	//학생들의 정보를 받아서
	//학생 한명 추가
	//추가가 완료된 학생 정보들을 리턴
	public Student [] addStudent(Student [] st2) {
		System.out.println("추가할 학생의 이름을 입력하세요");
		String a = sc.next();
		System.out.println("추가할 학생의 번호를 입력하세요");
		int b = sc.nextInt();
		System.out.println("추가할 학생의 국어점수를 입력하세요");
		int c = sc.nextInt();
		System.out.println("추가할 학생의 영어점수를 입력하세요");
		int d = sc.nextInt();
		System.out.println("추가할 학생의 수학점수를 입력하세요");
		int e = sc.nextInt();
		Student [] st4 = new Student [st2.length+1];
		for(int i=0; i<st2.length; i++) {
			st4[i] = new Student();
			st4[i].name = st2[i].name;
			st4[i].num = st2[i].num;
			st4[i].kor = st2[i].kor;
			st4[i].eng = st2[i].eng;
			st4[i].math = st2[i].math;
			st4[i].total = st2[i].total;
			st4[i].avg = st2[i].avg;
		}
		for(int i=st2.length; i<st4.length; i++) {
			st4[i] = new Student();
			st4[i].name = a;
			st4[i].num = b;
			st4[i].kor = c;
			st4[i].eng = d;
			st4[i].math = e;
			st4[i].setTotal();
		}
		return st4;
	}
	
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
			st[i].setTotal();
		}
		return st;
	}
}
