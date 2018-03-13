package factory.bjsxt.www;

public class BenFactory implements CarFactory{

	/**
	 * @param args
	 */
	public Car create(){
		return new Ben();
	}

}
