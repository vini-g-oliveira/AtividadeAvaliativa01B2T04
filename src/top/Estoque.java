package top;

public class Estoque {
	private String nome;
	private int quantidade;

	public Estoque(String nome, int quantidade)
	{
		if (!nome.isBlank())
		{	this.nome = nome;
		} 
else {
	System.out.println("Erro na declaração do nome"); }	

		if (quantidade > 0)
		{	this.quantidade = quantidade;} 
else 
{ System.out.println("Erro na declaração de quantidade"); }

}

	public String getNome() {return this.nome;}
	
	public int getQuantidade() {return this.quantidade;}

	public void setNome(String novoNome)
	{
		if (!novoNome.isBlank())
		{
			this.nome = novoNome;
			return;
		}
		System.out.println("Nome inválido.");
	}

	public void adicionar(int quantidade)
	{
		if (quantidade > 0)
		{
			this.quantidade += quantidade;
			return;
		}
		System.out.println("Quantidade inválida.");
	}

	public void remover(int quantidade)
	{
		
		if (!(this.quantidade - quantidade < 0))
		{
			this.quantidade -= quantidade;
			return;
		}
	}}

