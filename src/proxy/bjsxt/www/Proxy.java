package proxy.bjsxt.www;

public class Proxy implements Star {
	
	public Proxy(Star realStar) {
		realStar=new RealStar();
	}

	public void confer() {
		System.out.println("Proxy.confer()");
	}

	public void signContract() {
		System.out.println("Proxy.signContract()");
	}
	public void bookTicket() {
		System.out.println("Proxy.bookTicket()");
	}

	public void sing() {
		new RealStar().sing();
	}

	public void collectMoney() {
		System.out.println("Proxy.collectMoney()");
	}

}
