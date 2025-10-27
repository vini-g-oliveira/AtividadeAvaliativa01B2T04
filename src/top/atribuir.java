package top;

public class atribuir {

	public static void main(String[] args) {
		//atividade 1
		ContaBancaria titularum = new ContaBancaria("matheus",0);	
		titularum.deposito(40);

System.out.printf("o titular %s tem o saldo de %f.\n", titularum.getTitular(), titularum.getSaldo());

titularum.saque(20);
System.out.printf("agora o titular %s tem o saldo de %f.\n", titularum.getTitular(), titularum.getSaldo());
	
//atividade 2
	Filme filmeum = new Filme("avatar", 4);
	Filme filmedois =new Filme("avatar 2", 3);
	
	filmeum.exibir();
	filmedois.exibir();
	
	//atividade 3
	
	Funcionario funcionario1 = new Funcionario("marcos", 1500);
	
	
	
	System.out.printf("o salario do funcionario %s e de %f\n", funcionario1.getNome(), funcionario1.getSalario());
	
	funcionario1.aumento(20);
	
	System.out.printf("agora o salario do funcionario %s e de %f\n", funcionario1.getNome(), funcionario1.getSalario());
	
	
 // atividade 4
	
	Retangulo retangulo = new Retangulo(2, 5);
	var areaRetangulo = retangulo.getArea();
	var perimetroRetangulo = retangulo.getPerimetro();
	
	System.out.println("dimensao "+retangulo.getAltura() +"  "+ retangulo.getLargura());
	System.out.println("Area "+ areaRetangulo);
	System.out.println("perimetro "+perimetroRetangulo);
	
	
//atividade5
	
	Musica musica1 = new Musica("mega funk", 345);
	
	System.out.println("musica "+ musica1.getTitulo() + " duracao " + musica1.trocarDuracao());
	
	
	//atividade6
	
	IMC pessoa1 = new IMC("marcos", 60.0, 1.50);
	String classificacaoIMC = pessoa1.classificacaoIMC();
	
	System.out.printf("o IMC e " + pessoa1.calcularIMC());
	System.out.println(" "+pessoa1.classificacaoIMC());
	
	
	//atividade 7
	
	ContaLuz conta = new ContaLuz(75, 3.0);
	System.out.println("a conta deu: Rs " + conta.calcularValor());
	
	//atividade 8
	Bicicleta bike = new Bicicleta(15, 5);
	System.out.println("horas " + bike.getValor());
	System.out.println("valor hora " + bike.calculo());
	
	//atividade 9
	
	Estoque estoque1 = new Estoque("lapis",10);
	
	estoque1.adicionar(10);
	estoque1.remover(15);
	
	System.out.println("a quantidade no estoque e de "+estoque1.getQuantidade());
	
	//atividade10
	
	Temperatura temp = new Temperatura(70);
	
	System.out.println("Temperatura inicial: " + temp.getTemperatura() + "C");
	double tempFahrenheit = temp.paraFahrenheit();
	System.out.println("Convertido para Fahrenheit: " + tempFahrenheit + "F");
	double tempKelvin = temp.paraKelvin();
	System.out.println("Convertido para Kelvin: " + tempKelvin + "K");
	
	
	
	
	
	
	}
}





 