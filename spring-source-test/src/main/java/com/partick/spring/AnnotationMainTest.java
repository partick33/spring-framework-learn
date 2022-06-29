package com.partick.spring;

import com.partick.spring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 注解版Spring用法
 * @author partick_peng
 */
public class AnnotationMainTest {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		//Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

		//false
		//Animal bean1 = applicationContext.getBean(Animal.class);
		//Animal bean2 = applicationContext.getBean(Animal.class);
		//System.out.println(bean1==bean2);


		//Person bean1 = applicationContext.getBean(Person.class);
		//Animal animal1 = bean1.getAnimal();
		//Person bean2 = applicationContext.getBean(Person.class);
		//Animal animal2 = bean2.getAnimal();
		//通过@Lookup可以寻找不同的Bean值为false，否则值为true
		//System.out.println(animal1==animal2);
	}
}
