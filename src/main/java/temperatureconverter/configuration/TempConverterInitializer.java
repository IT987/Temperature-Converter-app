package temperatureconverter.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TempConverterInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Retrieves the servlet configuration classes.
	 * 
	 * This method return an array of classes representing the servlet configuration
	 * classes for the Spring application context. In this case, it returns an array
	 * containing TempConverterConfig class, specifying the configuration for the
	 * servlet.
	 * 
	 * @return An array of classes representing the servlet configuration classes.
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		Class<?>[] config = { TempConverterConfig.class };
		return config;
	}

	/**
	 * Retrieves the servlet mappings.
	 * 
	 * This method return an array of URL patterns mapping to the
	 * DispatcherServlet. In this case, it returns an array containing "/"
	 * indicating that the DispatcherServlet will handle all requests coming to the
	 * root URL.
	 * 
	 * @return An array of URL patterns mapping to the DispatcherServlet.
	 */
	@Override
	protected String[] getServletMappings() {
		
		String[] mapping = { "/" };
		return mapping;
	}

}
