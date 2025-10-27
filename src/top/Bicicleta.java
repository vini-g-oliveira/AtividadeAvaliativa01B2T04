package top;

public class Bicicleta {
	private int horas;
	private double valor;

	public Bicicleta(int horas, double valor)
	{
		this.setHoras(horas);
		this.setValor(valor);
	}

	public int getHoras()
	{
		return this.horas;
	}

	public double getValor()
	{
		return this.valor;
	}


	public void setHoras(int quantidade)
	{
		if (quantidade >= 1)
		{
			this.horas = quantidade;
			return;
		}
	}

	public void setValor(double valor)
	{
		if (valor > 0)
		{
			this.valor = valor;
			return;
		}

	}

	public double calculo()
	{
		return this.horas * this.valor;
	}
}