package server;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String args[]) {
//    	Transportation transport = new Transportation();
//    	transport.move();
    	
    	GenericXmlApplicationContext ctx = new
    			GenericXmlApplicationContext("classpath:applicationContext.xml");
    	Transportation transport = ctx.getBean("tWalk", Transportation.class);
    	transport.move();
    	
    	ctx.close();
    }
}
