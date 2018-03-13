package proxy.bjsxt.www;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler{

	Star realStar;
	
	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("+++");
		if(method.getName().equals("sing")){
		method.invoke(realStar, args);
		}
		
		return null;
	}
	
}
