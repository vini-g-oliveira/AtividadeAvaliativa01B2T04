package top;

public class Musica {

private String titulo;
private int duracao;

public Musica(String titulo, int duracao) {
	this.setTitulo(titulo);
	this.setduracao(duracao);
}

public String getTitulo() 
{ return this.titulo; } 

public int getDuracao() 
{ return this.duracao; }

public void setTitulo(String outroTitulo)
{
	if (!outroTitulo.isBlank())
	{
		this.titulo = outroTitulo;
		return;
	}
}

public void setduracao(int duracao)
{
	if (duracao > 0)
	{
		this.duracao = duracao;
		return;
	}
}

public String trocarDuracao()
{
	
	double novoValor = duracao / 60.0;

	return Double.toString(novoValor);
}
}






