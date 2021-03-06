package com.producer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Email implements Message, BeanNameAware, BeanFactoryAware, ApplicationContextAware,InitializingBean, DisposableBean{
	
	private String senderMail;
	private String receiverMail;
	private String beanName;

	public Email(String senderMail, String receiverMail) {
		super();
		System.out.println("1. Email constuctor");
		this.senderMail = senderMail;
		this.receiverMail = receiverMail;
	}
	
	@Override
	public void send() {
		System.out.println("Sending mail from "+senderMail+" to "+receiverMail);

	}


	@Override
	public void setBeanName(String name) {
		System.out.println("2. Setting the Bean Name to : " + name);
		this.beanName=name;	
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("3. Setting up bean factory if any to : "+beanName);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("4. Setting up bean application context if any to : "+beanName);
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("6. Common Init Method for all Jugglers and this is for "+beanName);
		
	}
	
	public void customInitForBean1() {
		System.out.println("7. Custom Init method 1 for "+beanName);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Distruction 1: destroy for "+beanName);
		
	}
	public void customDestroyForBean1() {
		System.out.println("Distruction 2 : custom destroy method 1 for "+beanName);
	}

}
