package heranca;

public class Funcionario {
	//Atributos - Vari�veis de inst�ncia
	private String nome;
	private float salario;	
	
	//Construtor default
	public Funcionario() {
		super();
	}	
	//Construtor sobrecarregado
	public Funcionario(String nome, float salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	//M�todos da classe
	public void aumentarSalario(float perc) {
		this.salario += this.salario * ( perc / 100); 
	}
	
	public String imprimir() {
		return "Funcion�rio: " + this.nome + 
				"\nSal�rio: " + String.format("R$ %.2f \n", salario);
	}

}
