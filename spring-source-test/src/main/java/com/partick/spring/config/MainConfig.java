package com.partick.spring.config;

import com.partick.spring.bean.Animal;
import com.partick.spring.bean.Person;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author partick_peng
 */
@Import(MainConfig.MyImportRegistrar.class)
@ComponentScan("com.partick.spring")
@Configuration
public class MainConfig {
	//@Bean
	public Person person() {
		Person person = new Person();
		person.setName("李四");
		return person;
	}

	/**
	 * BeanDefinitionRegistrar: Bean定义信息注册中心
	 * 里面集成的都是BeanDefinition
	 *
	 * <bean class="com.partick.spring.bean.Person" id="person">
	 * 		<property name="name" value="张三"/>
 	 * </bean>
	 * 通过读取xml配置生成一个对应的BeanDefinition对象
	 */
	static class MyImportRegistrar implements ImportBeanDefinitionRegistrar {
		@Override
		public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
			//BeanDefinition
			RootBeanDefinition animalDefinition = new RootBeanDefinition();
			animalDefinition.setBeanClass(Animal.class);
			//设置为Scope为原型属性，等同于@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
			animalDefinition.setScope(ConfigurableBeanFactory.SCOPE_PROTOTYPE);

			//Spring 这个实例的名字
			registry.registerBeanDefinition("tomCat", animalDefinition);
		}
	}
}
