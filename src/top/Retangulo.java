package top;

public class Retangulo {
private double largura, altura;

public Retangulo(double largura, double altura) {
	this.setLargura(largura);
	this.setAltura(altura);
}

public double getLargura() {
	return this.largura;
}

public double getAltura() {
	return this.altura;
}

public void setLargura(double valorNovo) {
	if(valorNovo>0) {
		this.largura = valorNovo;
		return;
	}
}

public void setAltura(double valornovo) {
	if(valornovo >0) {
		this.altura = valornovo;
		return;
	}
}

public double getArea() {
	return this.altura * this.largura;
}

public double getPerimetro() {
	return 2*(this.largura+this.altura);
}





}
