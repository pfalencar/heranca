package heranca;

public class Gerente extends Funcionario {
	//Atributos - Vari�veis de inst�ncia
	private int nFuncionarios;

	//Construtor default
	public Gerente() {
		super();
	}
	//Construtor sobrecarregado
	public Gerente(int nFuncionarios, String nome, float salario) {
		super(nome, salario);
		this.nFuncionarios = nFuncionarios;
	}
	
	//Getters and Setters
	public int getnFuncionarios() {
		return nFuncionarios;
	}

	public void setnFuncionarios(int nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}
	
	//Reescrita do m�todo aumentarSalario
	@Override
	public void aumentarSalario(float perc) {
		super.aumentarSalario(perc + 20);
	}
	
	//Reescrita do m�todo imprimir
	@Override
	public String imprimir() {
		return super.imprimir() 
				+ "N�mero de funcion�rios gerenciados: " 
				+ this.nFuncionarios;
	}
	
}
