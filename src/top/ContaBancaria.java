package top;

 class ContaBancaria {
    private String titular;
    private double saldo;
   
    public ContaBancaria(String titular, double saldo) {
    	this.setTitular(titular);
    	if (saldo > 0) {
    		this.saldo=saldo;
    	}
    }

    public void setTitular(String titular) {
        if(titular !=null && !titular.isBlank()) {
            this.titular = titular;
        }
    }
    public String getTitular() {
        return this.titular;
    }

    public void setSaldo(double saldo) {
        if(saldo>0) {
            this.saldo = saldo;

        }
    }
    public double getSaldo() {
        return this.saldo;
    }

    public void deposito (double valor) {
	if(valor >=0)
	{this.saldo += valor; return;}}
	

public void saque (double valor){
	if(valor>0) 
	{	this.saldo-=valor; return; }
	
	
	
}



 
 
 
 }