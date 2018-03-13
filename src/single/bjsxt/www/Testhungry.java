package single.bjsxt.www;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class Testhungry implements Serializable{

	/**
	 * ����ͷ����л����ƽⵥ��ģʽ
	 * @param args
	 */
	private static Testhungry t;
	private Testhungry(){
		if (t!=null) {
			throw new RuntimeException();
		}
	}
	
	private static  Testhungry getInstance(){
		if (t==null) {
			t=new Testhungry();
		}
		return t;
	}
	public  Object readResolve() throws ObjectStreamException{
		return t;
	}
	public static void main(String[] args) throws Exception {
		Testhungry testhungry1=Testhungry.getInstance();
		Testhungry testhungry2=Testhungry.getInstance();
		System.out.println(testhungry1);
		System.out.println(testhungry2);
		//��������ƽⵥ��ģʽ
//		Class<?> c=Class.forName("single.bjsxt.www.Testhungry");
//		Constructor< ?> cc=c.getDeclaredConstructor();
//		cc.setAccessible(true);
//		Testhungry testhungry3=(Testhungry) cc.newInstance();
//		System.out.println(testhungry3);
		
		
		//���л�
		FileOutputStream io=new FileOutputStream("d:/myjava/a.txt");
		ObjectOutputStream oos=new ObjectOutputStream(io);
		oos.writeObject(testhungry1);
		oos.close();
		io.close();
		FileInputStream oo=new FileInputStream("d:/myjava/a.txt");
		ObjectInputStream iis=new ObjectInputStream(oo);
		Testhungry testhungry5=(Testhungry)iis.readObject();
		System.out.println(testhungry5);
	}
}
