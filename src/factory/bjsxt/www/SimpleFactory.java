package factory.bjsxt.www;

public class SimpleFactory {

	/**
	 * @param args
	 */
	public static Car create(String str){
		if("audi".equals(str)){
			return new Audi();
		}else if("ben".equals(str)){
			return new Ben();
		}else {
			return null;
		}
			
	}
}
