package single.bjsxt.www;

public class Hungry {

	/**
	 * ����ʽ
	 * �̰߳�ȫ,������������ʱ�ӣ�û��ͬ��Ч�ʸ�
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
