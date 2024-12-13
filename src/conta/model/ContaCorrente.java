package conta.model;

public class ContaCorrente extends Conta {

	private float limite;
	
	/*Método Construtor da Classe Conta - com todos os parâmetros*/
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}
	
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo)
	{
		super(numero, agencia, tipo, titular, saldo);
		this.limite = 5000f;
	}
	
	public void visualizar()
	{
		super.visualizar();
		System.out.println("Limite: " + this.limite);
	}
	
	public boolean sacar(float valor) { 
		
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
		
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	
}
