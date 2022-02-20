package br.com.bytebank.banco.modelo;

public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		total++;
		
		this.agencia = agencia;
		this.numero = numero;
//		this.saldo = 100;
		 
//		System.out.println("Estou criando uma conta com o número de agência: " + agencia + (", número da conta: ") + numero + (" e o saldo de: R$" + saldo));
//		System.out.println("O total de contas criadas é: " + total);
	}

	
	public Conta() {
		// TODO Auto-generated constructor stub
	}


	public abstract void deposita(double valor);
	
	public void saca(double valor) throws SaldoInsuficienteException {
		
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) { 
			System.out.println("Não pode valor menor igual a 0");
			return;
		}
		this.numero = numero;		
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia <= 0) { 
			System.out.println("Não pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}


	public static int getTotal() {
		return total;
	}

	
	
}