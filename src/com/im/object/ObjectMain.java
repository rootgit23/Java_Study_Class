package com.im.object;

public class ObjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("프로그램 시작");
	      //Object 생성
	      //클래스명 변수명
	      //데이터타입 변수명 = new 생성자();
	      Monster monster = new Monster();
	      System.out.println(monster);
	      Weapon weapon = new Weapon();
	      //멤버변수 접근
	      //변수명.멤버변수명
	      
	      monster.name="오크";
	      monster.hp=100;
	      monster.level = 5;
	      
	      System.out.println(monster.name);
	      System.out.println(monster.hp);
	      System.out.println(monster.level);
	      System.out.println("-------------------------------------------------------");
	      Monster monster2 = new Monster();
	      monster2.name="오크";
	      monster2.hp=100;
	      monster2.level=5;
	      System.out.println(monster==monster2);   
	      
	      System.out.println(monster2.name);
	      System.out.println(monster2.hp);
	      System.out.println(monster2.level);
	      
	      Weapon sword = new Weapon();   
	      sword.name="단검";
	      sword.damage=10;
	      sword.inchant=1;
	      
	      monster.weapon = sword;
	      monster2.weapon = sword;
	      System.out.println("몬스터가 들고있는 무기이름은?");
	      System.out.println(monster.weapon.name);
	      System.out.println(monster2.weapon.name);
	      System.out.println(sword.name);
	      System.out.println(sword.damage);
	      System.out.println(sword.inchant);      
	      
	      System.out.println("프로그램 종료");
	   }
}