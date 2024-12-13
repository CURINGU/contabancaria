package conta.model;

public class ContaPoupanca extends Conta {
	
	private int aniversario;
	
	/*Método Construtor da Classe Conta - com todos os parâmetros*/
	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario = aniversario;
	}
	
	public void visualizar()
	{
		super.visualizar();
		System.out.println("Aniversário da conta: " + this.aniversario);
	}

	public float getRendimento() {
		return aniversario;
	}

	public void setRendimento(int aniversario) {
		this.aniversario = aniversario;
	}

}
