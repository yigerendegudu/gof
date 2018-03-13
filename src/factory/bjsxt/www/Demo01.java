package factory.bjsxt.www;

public class Demo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car=SimpleFactory.create("audi");
		car.run();
	}

}
