package com.partick.spring;

import com.partick.spring.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author partick_peng
 */
public class MainTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Person person = applicationContext.getBean(Person.class);
		System.out.println(person);
	}
}
