package heranca;

public class Funcionario {
	//Atributos - Variáveis de instância
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
	
	//Métodos da classe
	public void aumentarSalario(float perc) {
		this.salario += this.salario * ( perc / 100); 
	}
	
	public String imprimir() {
		return "Funcionário: " + this.nome + 
				"\nSalário: " + String.format("R$ %.2f \n", salario);
	}

}
