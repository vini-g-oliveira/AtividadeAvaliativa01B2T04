package top;

public class Temperatura {
	private double celsius;

	public Temperatura(double grausCelsius) {
		this.setTemperatura(grausCelsius);
	}

	public double getTemperatura() {
		return this.celsius;
	}

	public void setTemperatura(double novaTempCelsius)
	{
		if (novaTempCelsius >= -273.15)
		{
			this.celsius = novaTempCelsius;
			return;
		}

	}

	public double paraFahrenheit()
	{
		return (this.celsius * 9/5) + 32;
	}

	public double paraKelvin()
	{
		return this.celsius + 273.15;
	}
}