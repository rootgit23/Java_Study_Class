package com.im.object1.ex1;

public class StudentView {
	
	public void view(Student st5) {
		if(st5 == null) {
			System.out.println("찾는 번호의 학생이 없습니다");
		}
		else {
			System.out.println("이름 " + st5.getName() + ", 번호 " + st5.getNum() + ", 국어점수 " + st5.getKor() + ", 영어점수 " + st5.getEng() + ", 수학점수 " + st5.getMath() + ", 총점 " + st5.getTotal() + ", 평균 " + st5.getAvg());
		}
			
	}
	//viewMessage
	//문자열을 받아서 그 문자열을 출력
	//public void view(String s) {
		//System.out.println(s);
	//}
	
	//viewall
	//학생들의 정보를 받아서 모든 정보를 출력
	public void view(Student [] st) {
		for(int i=0; i<st.length; i++) {
			System.out.println("이름 " + st[i].getName() + ", 번호 " + st[i].getNum() + ", 국어점수 " + st[i].getKor() + ", 영어점수 " + st[i].getEng() + ", 수학점수 " + st[i].getMath() + ", 총점 " + st[i].getTotal() + ", 평균 " + st[i].getAvg());
		}
		
	}
}
