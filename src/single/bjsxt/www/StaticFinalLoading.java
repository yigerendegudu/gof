package single.bjsxt.www;

public class StaticFinalLoading {

	/**
	 * 静态内部懒加载
	 * 线程安全，通过匿名静态内部类创建对象
	 * 调用效率高
	 * 延时加载
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
