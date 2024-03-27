package temperatureconverter.services;

public interface TemperatureConverterService {

	// Convert Celsius temperature to Fahrenheit
	double toFahrenheit(double celsiusTemperature);

	// Convert Fahrenheit temperature to Celsius
	double toCelsius(double fahrenheitTemperature);
}
