package day04_demo02;

public class Proxy {
	SchoolGirl mm;
	public Proxy(SchoolGirl mm) {
		this.mm = mm;
	}
	public void giveDolls() {
		System.out.println(mm.name + "����������");
	}
	public void giveFlowers() {
		System.out.println(mm.name +"�����ʻ�");
	}
	public void giveChocolate() {
		System.out.println(mm.name +"�����ɿ���");
	}
}
