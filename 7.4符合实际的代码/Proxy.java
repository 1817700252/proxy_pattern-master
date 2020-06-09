package day04_demo03;

import day04_demo02.SchoolGirl;

public class Proxy implements GiveGift{
	Pursuit gg;
	public Proxy(day04_demo01.SchoolGirl mm) {
		gg = new Pursuit(mm);
	}
	public Proxy(SchoolGirl jiaojiao) {
		// TODO Auto-generated constructor stub
	}
	public void giveChocolate() {
		gg.giveChocolate();
	}
	public void giveDolls() {
		gg.giveDolls();
	}
	public void giveFlowers() {
		gg.giveFlowers();
	}
}
