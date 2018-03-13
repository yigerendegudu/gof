package builder.bjsxt.www;

public class AirShipDirect implements ShipDirector{
	
	private AirShipBuilder airShipBuilder;
	
	public AirShipDirect(AirShipBuilder airShipBuilder) {
		super();
		this.airShipBuilder = airShipBuilder;
	}

	@Override
	public AirShip createShip() {
		Engine engine=airShipBuilder.builderEngine();
		Escape escape=airShipBuilder.builderEscape();
		OribitalMoudle oribitalMoudle=airShipBuilder.builderOribitalMoudle();
		AirShip airShip=new AirShip();
		airShip.setEngine(engine);
		airShip.setEscape(escape);
		airShip.setOribitalMoudle(oribitalMoudle);
		return airShip;
	}
	
}
