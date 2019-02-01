package visualmix.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import visualmix.dao.AnimalDao;

@ComponentScan(basePackageClasses = {AnimalDao.class})
public class AppWebConfiguration {
	
 
}
