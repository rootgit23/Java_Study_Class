package com.im.object1.ex1;

public class Student {
	private String name;
	private int num;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public void setNum(int num) {
		if(num > 0) {
			this.num = num;
		}
	}
	
	public int getKor() {
		return this.kor;
	}
	
	public void setKor(int kor) {
		if(kor >=0 && kor <= 100) {
			this.kor = kor;
		}
	}
	
	public int getEng() {
		return this.eng;
	}
	
	public void setEng(int eng) {
		if(eng >=0 && eng <= 100) {
			this.eng = eng;
		}
	}
	
	public int getMath() {
		return this.math;
	}
	
	public void setMath(int math) {
		if(math >=0 && math <= 100) {
			this.math = math;
		}
	}
	
	public int getTotal() {
		return this.total;
	}
	
	public void setTotal(int kor, int eng, int math) {
		this.total = this.kor + this.eng + this.math;
	}
	
	public double getAvg() {
		return this.avg;
	}
	
	public void setAvg(int total) {
		this.avg = this.total / 3.0;
	}
	
}