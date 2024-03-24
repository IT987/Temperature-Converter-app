package temperatureconverter.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "temperatureconverter")
public class TempConverterConfig implements WebMvcConfigurer {

	/**
	 * This method create and configure an InternalResourceViewResolver bean to
	 * resolve JSP view. It set the prefix to "/WEB-INF/view/" and the suffix to
	 * ".jsp" to locate JSP file within the application.
	 * 
	 * @return An InternalResourceViewResolver configured to resolve JSP view.
	 */
	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}
