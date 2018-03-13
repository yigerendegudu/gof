package brige.bjsxt.www;

public class Computer {
	protected Brand brand;
	public Computer(Brand brand) {
		super();
		this.brand = brand;
	}
	public void sale() {
		brand.sale();
	}
}
class Desktop extends Computer{

	public Desktop(Brand brand) {
		super(brand);
	}
	public void sale(){
		System.out.println("Desktop.sale()");
	}
}
class Laptop extends Computer{

	public Laptop(Brand brand) {
		super(brand);
	}
	public void sale(){
		System.out.println("Laptop.sale()");
	}
}