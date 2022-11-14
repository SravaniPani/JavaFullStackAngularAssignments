package com.assign8;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycle implements InitializingBean, DisposableBean, BeanNameAware {

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Setting the Bean Name");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		 System.out.println("Destroying the Method");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initializing the bean");
	}

}
