package prototype.bjsxt.www;
/**
 * 
 * @author liuhaijiao
 * 原型模式
 */
import java.util.Date;

public class Sheep {
	private String name;
	private Date date;
	public Sheep(String name, Date date) {
		super();
		this.name = name;
		this.date = date;
	}
	public Sheep() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Object clone() throws CloneNotSupportedException{
		Object obj=(Sheep)super.clone();
		return obj;
	}
}
