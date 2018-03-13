package builder.bjsxt.www;

public class Demo {
	public static void main(String[] args) {
		AirShipDirect air=new AirShipDirect(new AirShipBuilder());
		air.createShip();
		System.out.println(air);
	}
}
