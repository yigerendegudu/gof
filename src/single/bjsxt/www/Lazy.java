package single.bjsxt.www;

public class Lazy {

	/**
	 * 懒汉式
	 * 线程安全，需要同步，延时加载，真正要用的时候才要用
	 * 只能通过getInstance()方法
	 * @param args
	 * @author liuhaijiao
	 */
	private static Lazy lazy;

	private Lazy() {

	}

	private static synchronized Lazy getInstance() {
		if (lazy == null) {
			lazy = new Lazy();
		}
		return lazy;
	}
	public static void main(String[] args) {
		
		Lazy  lazy=Lazy.getInstance();
		Lazy  lazy2=Lazy.getInstance();
		if (lazy.equals(lazy2)) {
			System.out.println("6666");
		} else {
			System.out.println("223333333");
		}
		Lazy  lazy3=new Lazy();
		Lazy  lazy4=new Lazy();
		if (lazy3.equals(lazy4)) {
			System.out.println("6666");
		} else {
			System.out.println("223333333");
		}
	}
}
