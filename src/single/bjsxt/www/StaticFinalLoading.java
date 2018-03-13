package single.bjsxt.www;

public class StaticFinalLoading {

	/**
	 * ��̬�ڲ�������
	 * �̰߳�ȫ��ͨ��������̬�ڲ��ഴ������
	 * ����Ч�ʸ�
	 * ��ʱ����
	 * @param args
	 * @author liuhaijiao
	 */
	
	private static class StaticInner{
		 private static final StaticFinalLoading s=new StaticFinalLoading();
	}
	private StaticFinalLoading(){
		
	}
	public static StaticFinalLoading getInstance(){
		return StaticInner.s;
	}
	public static void main(String[] args) {
		StaticFinalLoading s2=StaticFinalLoading.getInstance();
		StaticFinalLoading s3=StaticFinalLoading.getInstance();
		System.out.println(s2==s3);
	}
}
