package top;

public class Funcionario {
private String nome;
private double salario;

public Funcionario(String nome, double salario) {
	
	this.nome = nome;
	this.salario = salario;
}

public void setNome(String nome) {
    if(nome !=null && !nome.isBlank()) {
       this.nome = nome;
    }}
public String getNome() {
	return this.nome;
}

public double getSalario() {
	
	return this.salario;
}

public void aumento(double aumento) {
	if(aumento >0) {
		aumento=this.salario *(aumento/100.0);
		this.salario+=aumento;

	}
	}




















}
