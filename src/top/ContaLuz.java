package top;

public class ContaLuz {
	private double consumo;
	private double valor;

	public ContaLuz(double consumo, double valor)
	{
		this.setConsumo(consumo);
		this.setValorKwh(valor);
	}

	public double getConsumo()
	{
		return this.consumo;
	}

	public double getValorKwh()
	{
		return this.valor;
	}

	public void setConsumo(double consumo)
	{
		if (consumo > 0)
		{
			this.consumo = consumo;
			return;
		}
	}

	public void setValorKwh(double valor)
	{
		if (valor > 0)
		{
			this.valor = valor;
			return;
		}
	}

	public double calcularValor()
	{
		return this.consumo * this.valor;
	}
}