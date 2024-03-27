package temperatureconverter.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import temperatureconverter.model.TemperatureConverterModel;
import temperatureconverter.services.TemperatureConverterService;

@Controller
public class TemperatureConverterController {

	private TemperatureConverterService converterService;

	@Autowired
	public TemperatureConverterController(TemperatureConverterService converterService) {
		super();
		this.converterService = converterService;
	}

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

	/**
	 * Handles the POST request to convert temperature units.
	 *
	 * @param convertForm The model attribute containing temperature conversion data.
	 * @return The view name for rendering the conversion page.
	 */
	@PostMapping("convert")
	public String convertUnit(@Valid @ModelAttribute("convertForm") TemperatureConverterModel convertForm,
			BindingResult bindingResult) {
		// Check if there are any binding errors
		if (bindingResult.hasErrors()) {
			// If errors exist, print them to the console
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			for (ObjectError temp : allErrors) {
				System.out.println(temp);
			}
			// Return to the conversion form page to display errors
			return "convert";
		}

		// Variable to hold the result of temperature conversion
		double result = 0;

		// Determine the temperature conversion based on the selected unit
		if ("toFahrenheit".equals(convertForm.getTempUnit())) {
			// If converting to Fahrenheit, call the converter service method
			result = converterService.toFahrenheit(convertForm.getTemperature());
			// Set the units accordingly
			convertForm.setFromUnit(" °C");
			convertForm.setToUnit(" °F");
		} else if ("toCelsius".equals(convertForm.getTempUnit())) {
			// If converting to Celsius, call the converter service method
			result = converterService.toCelsius(convertForm.getTemperature());
			// Set the units accordingly
			convertForm.setFromUnit(" °F");
			convertForm.setToUnit(" °C");
		}

		// Set the result of the conversion
		convertForm.setResult(result);

		// Return to the conversion form page to display the result
		return "convert";
	}

}
