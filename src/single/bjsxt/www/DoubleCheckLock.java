package single.bjsxt.www;
public class DoubleCheckLock {

	/**
	 * 双重检测锁 出问题不建议使用 不测试
	 * 
	 * @param args
	 * @author liuhaijiao
	 */
	public static void main(String[] args) {
		System.out.println(EnumSingle.Instance==EnumSingle.Instance);
	}

}
