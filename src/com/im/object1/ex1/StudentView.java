package com.im.object1.ex1;

public class StudentView {
	
	public void view(Student st5) {
		if(st5 == null) {
			System.out.println("찾는 번호의 학생이 없습니다");
		}
		else {
			System.out.println("이름 " + st5.name + ", 번호 " + st5.num + ", 국어점수 " + st5.kor + ", 영어점수 " + st5.eng + ", 수학점수 " + st5.math + ", 총점 " + st5.total + ", 평균 " + st5.avg);
		}
			
	}
	//viewMessage
	//문자열을 받아서 그 문자열을 출력
	public void view(String s) {
		System.out.println(s);
	}
	
	//viewall
	//학생들의 정보를 받아서 모든 정보를 출력
	public void view(Student [] st) {
		for(int i=0; i<st.length; i++) {
			System.out.println("이름 " + st[i].name + ", 번호 " + st[i].num + ", 국어점수 " + st[i].kor + ", 영어점수 " + st[i].eng + ", 수학점수 " + st[i].math + ", 총점 " + st[i].total + ", 평균 " + st[i].avg);
		}
		
	}
}
