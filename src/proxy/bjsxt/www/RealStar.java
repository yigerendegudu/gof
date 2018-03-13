package proxy.bjsxt.www;

public class RealStar implements Star{
	
	@Override
	public void confer() {
		System.out.println("RealStar.confer()");
	}

	public void signContract() {
		System.out.println("RealStar.signContract()");
	}

	public void bookTicket() {
		System.out.println("RealStar.bookTicket()");
	}

	public void sing() {
		System.out.println("RealStar(±æ»À).sing()");
	}

	public void collectMoney() {
		System.out.println("RealStar.collectMoney()");
	}

}
