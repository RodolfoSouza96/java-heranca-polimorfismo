package br.com.bytebank.banco.modelo;
/**
 * 
 * @author Rodolfo
 *
 */
public class SaldoInsuficienteException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public SaldoInsuficienteException() {
		super();
	}
	
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}

}
