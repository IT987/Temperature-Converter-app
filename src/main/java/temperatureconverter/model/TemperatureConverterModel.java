package temperatureconverter.model;

public class TemperatureConverterModel {

	private double temperature;
	private String tempUnit;
	private String fromUnit;
	private String toUnit;
	private double result;

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public String getTempUnit() {
		return tempUnit;
	}

	public void setTempUnit(String tempUnit) {
		this.tempUnit = tempUnit;
	}

	public String getFromUnit() {
		return fromUnit;
	}

	public void setFromUnit(String fromUnit) {
		this.fromUnit = fromUnit;
	}

	public String getToUnit() {
		return toUnit;
	}

	public void setToUnit(String toUnit) {
		this.toUnit = toUnit;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "TemperatureConverterModel [temperature=" + temperature + ", tempUnit=" + tempUnit + ", fromUnit="
				+ fromUnit + ", toUnit=" + toUnit + ", result=" + result + "]";
	}

}
