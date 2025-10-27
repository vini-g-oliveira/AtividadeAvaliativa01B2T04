package top;

public class IMC {
	private String nome;
	private double peso;
	private double altura;

	public IMC(String nome, double peso, double altura)
	{
		this.setNome(nome);
		this.setPeso(peso);
		this.setAltura(altura);
	}

	public String getNome()
	{
		return this.nome;
	}

	public double getPeso()
	{
		return this.peso;
	}

	public double getAltura()
	{
		return this.altura;
	}

	public void setNome(String novoNome)
	{
		if (!novoNome.isBlank())
		{
			this.nome = novoNome;
			return;
		}
	}

	public void setPeso(double novoPeso)
	{
		if (novoPeso > 0)
		{
			this.peso = novoPeso;
			return;
		}
	}

	public void setAltura(double novaAltura)
	{
		if (novaAltura > 0)
		{
			this.altura = novaAltura;
			return;
		}
	}

	public double calcularIMC()
	{
		return this.peso / (this.altura * this.altura);
	}

	public String classificacaoIMC()
	{
		var calculo = this.calcularIMC();

		if (calculo >= 40.0)
		{
			return "Obesidade grau 3";
		} else if (calculo >= 35.0)
		{
			return "Obesidade grau 2";
		} else if (calculo >= 30.0)
		{
			return "Obesidade grau 1";
		} else if (calculo >= 25.0)
		{
			return "Sobrepreso";
		} else if (calculo >= 18.5)
		{
			return "Peso normal";
		} else {
			return "Abaixo do peso";
		}
	}
}