package com.gyan.consumer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.gyan.producer.Greet;

public class GreetConsumer {
	
public static void main(String[] args) {
	
	Resource resource=new ClassPathResource("greet.xml");
	BeanFactory springContainer=new XmlBeanFactory(resource);
	
	Greet greetMrg=(Greet)springContainer.getBean("mrng");
	greetMrg.wish();
	
	Greet greetEve=(Greet)springContainer.getBean("eve");
	greetEve.wish();
	
	}

}
