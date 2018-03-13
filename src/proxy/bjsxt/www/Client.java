package proxy.bjsxt.www;

public class Client {
	public static void main(String[] args) {
		Star realStar=new RealStar();
		Star proxy=new Proxy(realStar);
		proxy.confer();
		proxy.signContract();
		proxy.bookTicket();
		proxy.sing();
		proxy.collectMoney();
		
		Star realStar2=new RealStar();
		StarHandler handler=new StarHandler(realStar2);
//		Star proxStar=(Proxy)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[] {Star.class},handler);
//		proxStar.bookTicket();
//		proxStar.collectMoney();
	}
}
