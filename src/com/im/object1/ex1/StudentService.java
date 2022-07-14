package com.im.object1.ex1;

import java.util.Scanner;

public class StudentService {
	Scanner sc1;
	public StudentService() {
		sc1 = new Scanner(System.in);
	}
	
	//removeStudent
	//학생들의 정보를 받아서 삭제하려는 학생의 번호를 입력 받음
	//번호와 일치하는 학생과 정보를 삭제하고 남은 학생들을 리턴
	public Student [] removeStudent(Student [] st6) {
		boolean flag = false;
		int index = 0;
		Student [] st7 = new Student[st6.length-1];
		System.out.println("삭제하려는 학생의 번호를 입력하세요");
		int x = sc.nextInt();
		for(int i=0; i< st6.length; i++) {
			if(st6[i].getNum() == x) {
				flag = !flag;
			}
		}
		if(flag) {
			for(int i=0; i< st6.length; i++) {
				st7[index] = new Student();
				if(st6[i].getNum() == x) {
					continue;
				}
				st7[index].setName(st6[i].getName());
				st7[index].setNum(st6[i].getNum());
				st7[index].setKor(st6[i].getKor());
				st7[index].setEng(st6[i].getEng());
				st7[index].setMath(st6[i].getMath());
				st7[index].setTotal(st6[i].getKor(), st6[i].getEng(), st6[i].getMath());
				st7[index].setAvg(st6[i].getTotal());
				index++;
			}
		}
		else
			return null;
		return st7;
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
			st4[i].setName(st2[i].getName());
			st4[i].setNum(st2[i].getNum());
			st4[i].setKor(st2[i].getKor());
			st4[i].setEng(st2[i].getEng());
			st4[i].setMath(st2[i].getMath());
			st4[i].setTotal(st2[i].getKor(),st2[i].getEng(),st2[i].getMath());
			st4[i].setAvg(st2[i].getTotal());
		}
		for(int i=st2.length; i<st4.length; i++) {
			st4[i] = new Student();
			st4[i].setName(a);
			st4[i].setNum(b);
			st4[i].setKor(c);
			st4[i].setEng(d);
			st4[i].setMath(e);
			st4[i].setTotal(c,d,e);
			st4[i].setAvg(st4[i].getTotal());
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
			if(st3[j].getNum() == a) {
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
			st[i].setName(sc.next());
			System.out.println(i+1 + "번째 학생의 번호를 입력하세요");
			st[i].setNum(sc.nextInt());
			System.out.println(i+1 + "번째 학생의 국어점수를 입력하세요");
			st[i].setKor(sc.nextInt());
			System.out.println(i+1 + "번째 학생의 영어점수를 입력하세요");
			st[i].setEng(sc.nextInt());
			System.out.println(i+1 + "번째 학생의 수학점수를 입력하세요");
			st[i].setMath(sc.nextInt());
			st[i].setTotal(st[i].getKor(),st[i].getEng(),st[i].getMath());
			st[i].setAvg(st[i].getTotal());
		}
		return st;
	}
}
