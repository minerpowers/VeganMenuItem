package dmacc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.MenuItem;
import dmacc.beans.Restaurant;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.MenuItemRepository;

@SpringBootApplication
public class VeganMenuItemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(VeganMenuItemApplication.class, args);
		
	}
	@Autowired
    MenuItemRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		MenuItem m = appContext.getBean("menuItem", MenuItem.class);
		repo.save(m);
		
		MenuItem m1 = new MenuItem("Spartan",7.00);
		Restaurant r = appContext.getBean("restaurant", Restaurant.class);
		m1.setRestaurant(r);
		repo.save(m1);
		
		((AbstractApplicationContext) appContext).close();
	}

}
