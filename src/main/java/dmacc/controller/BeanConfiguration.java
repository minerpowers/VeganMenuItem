package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.MenuItem;
import dmacc.beans.Restaurant;

@Configuration
public class BeanConfiguration {
	@Bean
	public MenuItem menuItem() {
		MenuItem bean = new MenuItem("original Dirt Burger");
		bean.setPrice(7.00);
		return bean;
	}
	@Bean
	public Restaurant restaurant() {
		Restaurant bean = new Restaurant("Dirt Burger", "515-850-3890");
		return bean;
	}
}
