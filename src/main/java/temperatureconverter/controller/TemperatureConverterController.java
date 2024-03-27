package temperatureconverter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import temperatureconverter.model.TemperatureConverterModel;

@Controller
public class TemperatureConverterController {

	/**
	 * This method handles GET requests for the root URL ("/") and populates the
	 * provided model with the temperature converter model object. This allows the
	 * conversion form to be displayed.
	 * 
	 * @param model     The model to add attributes to, used to pass data to the
	 *                  view.
	 * @param tempModel The temperature converter model object to be added to the
	 *                  model.
	 * @return The name of the JSP page to display.
	 */
	@GetMapping("/")
	public String showConvertForm(Model model, TemperatureConverterModel tempModel) {

		model.addAttribute("convertForm", tempModel);
		return "convert";
	}
}
