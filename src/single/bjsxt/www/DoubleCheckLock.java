package single.bjsxt.www;
public class DoubleCheckLock {

	/**
	 * ˫�ؼ���� �����ⲻ����ʹ�� ������
	 * 
	 * @param args
	 * @author liuhaijiao
	 */
	public static void main(String[] args) {
		System.out.println(EnumSingle.Instance==EnumSingle.Instance);
	}

}
