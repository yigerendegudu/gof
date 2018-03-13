package prototype.bjsxt.www;

import java.util.Date;

public class Demo {
	public static void main(String[] args) {
		Date d=new Date(System.currentTimeMillis());
		Sheep s1=new Sheep("duoli",d);
		System.out.println(s1.getName());
		System.out.println(s1.getDate());
		
		Sheep s2;
		try {
			s2 = (Sheep)s1.clone();
		System.out.println(s2.getName());
		System.out.println(s2.getDate());
		
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
