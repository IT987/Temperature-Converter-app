package temperatureconverter.services;

import org.springframework.stereotype.Service;

@Service
public class TemperatureConverterServiceImpl implements TemperatureConverterService {

	@Override
	public double toFahrenheit(double celsiusTemperature) {

		// Formula for converting Celsius to Fahrenheit
		return (celsiusTemperature * 9 / 5) + 32;
	}

	@Override
	public double toCelsius(double fahrenheitTemperature) {

		// Formula for converting Fahrenheit to Celsius
		return (fahrenheitTemperature - 32) * 5 / 9;
	}

}
