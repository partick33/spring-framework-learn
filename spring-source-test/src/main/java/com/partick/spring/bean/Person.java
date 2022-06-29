package com.partick.spring.bean;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @author partick_peng
 */
@Component
public class Person {
	private String name;

	private Animal animal;

	//org/springframework/beans/factory/annotation/Lookup.java:47
	//源码中说明@Bean注入的方式，@Lookup不生效
	@Lookup
	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", animal=" + animal +
				'}';
	}
}
