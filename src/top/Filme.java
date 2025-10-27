package top;

public class Filme {

	private String titulo;
	private double avaliacao;
	
	public Filme(String titulo, double avaliacao) {
		this.setTitulo(titulo);
		this.setAvaliacao(avaliacao);
	}
	
	public String setTitulo(String titulo){
		if(titulo !=null && !titulo.isBlank())
		{	this.titulo = titulo;}
		return titulo;
	}
	public String getTitulo() {
		return titulo;
	}
	
	public double setAvaliacao(double avaliacao) {
		if(avaliacao >=0 && avaliacao<=5) 
		{this.avaliacao = avaliacao;}
		else {System.out.println("a avaliacao tem que ser de 0 a 5");
	}
		return avaliacao;

 }
	public double getAvaliacao() {
		return avaliacao;
	}
	
	public void exibir() {
		System.out.printf("o filme " +this.titulo + " avaliacao " + this.avaliacao);
		
	}
}
