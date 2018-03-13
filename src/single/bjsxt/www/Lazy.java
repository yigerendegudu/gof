package single.bjsxt.www;

public class Lazy {

	/**
	 * ����ʽ
	 * �̰߳�ȫ����Ҫͬ������ʱ���أ�����Ҫ�õ�ʱ���Ҫ��
	 * ֻ��ͨ��getInstance()����
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
