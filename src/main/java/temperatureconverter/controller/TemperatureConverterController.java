package temperatureconverter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemperatureConverterController {

	/**
	 * This method handles GET requests for the root URL ("/") and 
	 * @return The name of the JSP page to display.
	 */
	@GetMapping("/")
	public String showConvertForm() {

		return "convert";
	}
}
