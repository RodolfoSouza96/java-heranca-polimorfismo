
public class TesteSaca {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(323, 321);
		
		c.deposita(200.0);
		
		try {
			c.saca(210);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Ex: " + e.getMessage());
		}
		
		
		System.out.println(c.getSaldo());
		
		
		
		
	}
	
}
