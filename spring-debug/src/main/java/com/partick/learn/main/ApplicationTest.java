package com.partick.learn.main;

import com.partick.learn.config.TestConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author patrick_peng
 * @description 测试启动类
 * @date 2022-08-26 15:37
 **/
public class ApplicationTest {
	private static final Logger logger = LoggerFactory.getLogger(ApplicationTest.class);

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(TestConfig.class);
		logger.info("源码编译成功：" + annotationConfigApplicationContext.getId());
	}
}
