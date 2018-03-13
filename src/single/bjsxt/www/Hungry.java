package single.bjsxt.www;

public class Hungry {

	/**
	 * 饿汉式
	 * 线程安全,立即加载无延时从，没有同步效率高
	 * @param args
	 * @author liuhaijiao
	 */
	private static Hungry hungry=new Hungry();

	private Hungry() {
		
	}

	public static Hungry getInstance() {
		return hungry;
	}

	public static void main(String[] args) {
		Hungry hungry = Hungry.getInstance();
		Hungry hungry2 = Hungry.getInstance();
		if (hungry.equals(hungry2)) {
			System.out.println("6666");
		} else {
			System.out.println("223333333");
		}
	}
}
