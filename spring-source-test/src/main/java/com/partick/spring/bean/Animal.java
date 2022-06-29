package com.partick.spring.bean;

/**
 * @author partick_peng
 */
public class Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Animal{" +
				"name='" + name + '\'' +
				'}';
	}
}
