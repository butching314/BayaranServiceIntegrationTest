package main.webapp.configuration;

import main.webapp.HelloWorld;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	@Bean
	@Scope(value=BeanDefinition.SCOPE_PROTOTYPE)
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
}
