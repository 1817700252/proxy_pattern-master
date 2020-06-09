package day04_demo03;

import day04_demo02.SchoolGirl;

public class Main {
	public static void main(String[] args) {
		SchoolGirl jiaojiao = new SchoolGirl();
		jiaojiao.setName("¿ÓΩøΩø");
		Proxy daili = new Proxy(jiaojiao);
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
	}
}
