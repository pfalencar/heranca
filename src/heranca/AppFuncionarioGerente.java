package heranca;

import java.util.Scanner;

public class AppFuncionarioGerente {

	public static void main(String[] args) {
		/*
		Scanner entrada = new Scanner (System.in);
		
		Funcionario func = new Funcionario("José da Silva", 1000.0f);
		Gerente ger = new Gerente(45, "João Medeiros", 5000.0f);
		
		//calcular 10% de aumento de salário para os funcionários
		func.aumentarSalario(10);
		ger.aumentarSalario(10);
		
		System.out.println("===== DADOS DO FUNCIONÁRIO =====");
		System.out.println(func.imprimir());
		System.out.println("===== DADOS DO GERENTE =====");
		System.out.println(ger.imprimir());
		*/
		
		//Departamento 
		Departamento depto = new Departamento();
		Gerente g = new Gerente(50, "Josefina Marcondes", 10000.0f);
		Funcionario f;		
		f = g; //OK. Porque todo Gerente é um Funcionario		
		//Um objeto da subclasse pode ser passado como argumento para 
		//qualquer método que espera um parâmetro da superclasse		
		depto.adicionar(f); //aqui eu poderia passar o gerente tb!
		System.out.println(depto.listar());
		
		//Um objeto da superclasse não pode ser atribuído a um objeto da subclasse:
		Funcionario f1 = new Funcionario();
		Gerente g1;		
		//Erro: Não pode converter um Funcionario para Gerente. Nem todo Funcionário é um Gerente
		//g1 = f1; 		
		//Neste caso podemos fazer um UPCAST. 
		//Qdo subclasses são promovidas a superclasses.
		//A conversão é implícita (ou seja, automática). Gerente É UM Funcionario.
		//Posso guardar um Gerente dentro de um Funcionario.
		//Posso guardar um ArrayList dentro de um List.
		Funcionario f2 = new Gerente(); //upcast
		
		//Pensando nos tipos primitivos é o mesmo que guardar um int em um double:
		//int a = 10; double x; 
		//x = a; //conversão implícita
		//System.out.println("valor: " + x); // saída: valor: 10.0
		
		
		
		//DOWNCAST. Qdo superclasses são convertidas em subclasses
		//A conversão é explícita. Tem que indicar o TIPO. 
		//Gerente gerente = (Gerente) f1; //downcast
		
		//Pensando nos tipos primitivos é o mesmo que guardar um double em um int:
		//double a = 25.98; int x; 
		//x = (int)a; //conversão explícita (cast)
		//System.out.println("valor: " + x); // saída: valor: 25
		
		//Operador instanceof. Verifica se o objeto é do tipo da subclasse
		Funcionario f3 = new Gerente(10, "Ana", 5000.0f);
		if (f3 instanceof Gerente) {
			System.out.println("é um gerente");
		}
		
	}

}
