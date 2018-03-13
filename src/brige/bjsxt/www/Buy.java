package brige.bjsxt.www;

public class Buy {
	public static void main(String[] args) {
		Computer c1=new Computer(new Dell());
		System.out.println(c1.brand);
		c1.sale();
	}
}
