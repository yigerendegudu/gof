package builder.bjsxt.www;

public class AirShip {
	private Escape escape;
	private Engine engine;
	private OribitalMoudle oribitalMoudle;
	public Escape getEscape() {
		return escape;
	}
	public void setEscape(Escape escape) {
		this.escape = escape;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public OribitalMoudle getOribitalMoudle() {
		return oribitalMoudle;
	}
	public void setOribitalMoudle(OribitalMoudle oribitalMoudle) {
		this.oribitalMoudle = oribitalMoudle;
	}
	
}
class Escape{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Escape(String name) {
		super();
		this.name = name;
	}

	public Escape() {
		super();
	}
	
}
class Engine{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Engine(String name) {
		super();
		this.name = name;
	}

	public Engine() {
		super();
	}
	
}
class OribitalMoudle{
	String nameString;

	public OribitalMoudle(String nameString) {
		super();
		this.nameString = nameString;
	}

	public OribitalMoudle() {
		super();
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	
}