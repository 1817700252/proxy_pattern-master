package day04_demo03;

import day04_demo01.SchoolGirl;

public class Pursuit implements GiveGift{
	SchoolGirl mm;
	public Pursuit(SchoolGirl mm) {
		this.mm = mm;
	}
	public void giveDolls() {
		System.out.println(mm.name + "ËÍÄãÑóÍŞÍŞ");
	}
	public void giveFlowers() {
		System.out.println(mm.name + "ËÍÄãÏÊ»¨");
	}
	public void giveChocolate() {
		System.out.println(mm.name +"ËÍÄãÇÉ¿ËÁ¦");
	}
}
