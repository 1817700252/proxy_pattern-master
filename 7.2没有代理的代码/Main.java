package day04_demo01;

public class Main {
	public static void main(String [] args) {
		SchoolGirl jiaojiao = new SchoolGirl();
		jiaojiao.setName("¿ÓΩøΩø");
		Pursuit zhoujiayi = new Pursuit(jiaojiao);
		zhoujiayi.giveDoulls();
		zhoujiayi.giveFlowers();
		zhoujiayi.giveChocolate();
	}
}
