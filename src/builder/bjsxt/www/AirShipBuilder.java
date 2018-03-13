package builder.bjsxt.www;

public class AirShipBuilder implements BuilderShip{

	public Engine builderEngine() {
		System.out.println("fa");
		return new Engine("fa");
	}

	@Override
	public OribitalMoudle builderOribitalMoudle() {
		System.out.println("gui");
		return new OribitalMoudle("gui");
	}

	@Override
	public Escape builderEscape() {
		System.out.println("escape");
		return new Escape("escape");
	}

}
