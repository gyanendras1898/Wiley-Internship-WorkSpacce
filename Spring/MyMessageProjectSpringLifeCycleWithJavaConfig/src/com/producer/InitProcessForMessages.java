package com.producer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitProcessForMessages implements BeanPostProcessor {
	
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("5. Pre Initialization for "+bean.getClass()+" : "+beanName);
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("8. Post Process after Initialization "+bean.getClass()+" : "+beanName);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

}
