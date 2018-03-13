package brige.bjsxt.www;
/**
 * 
 * ге╫сдёй╫
 * @author liuhaijiao
 *
 */
public interface Brand {
	void sale();
}
class Lenove implements Brand{

	public void sale() {
		System.out.println("lenove.sale()");
	}
	
}
class Dell implements Brand{

	public void sale() {
		System.out.println("dell.sale()");
	}
	
}
