package heranca;

import java.util.Scanner;

public class AppFuncionarioGerente {

	public static void main(String[] args) {
		/*
		Scanner entrada = new Scanner (System.in);
		
		Funcionario func = new Funcionario("Jos� da Silva", 1000.0f);
		Gerente ger = new Gerente(45, "Jo�o Medeiros", 5000.0f);
		
		//calcular 10% de aumento de sal�rio para os funcion�rios
		func.aumentarSalario(10);
		ger.aumentarSalario(10);
		
		System.out.println("===== DADOS DO FUNCION�RIO =====");
		System.out.println(func.imprimir());
		System.out.println("===== DADOS DO GERENTE =====");
		System.out.println(ger.imprimir());
		*/
		
		//Departamento 
		Departamento depto = new Departamento();
		Gerente g = new Gerente(50, "Josefina Marcondes", 10000.0f);
		Funcionario f;		
		f = g; //OK. Porque todo Gerente � um Funcionario		
		//Um objeto da subclasse pode ser passado como argumento para 
		//qualquer m�todo que espera um par�metro da superclasse		
		depto.adicionar(f); //aqui eu poderia passar o gerente tb!
		System.out.println(depto.listar());
		
		//Um objeto da superclasse n�o pode ser atribu�do a um objeto da subclasse:
		Funcionario f1 = new Funcionario();
		Gerente g1;		
		//Erro: N�o pode converter um Funcionario para Gerente. Nem todo Funcion�rio � um Gerente
		//g1 = f1; 		
		//Neste caso podemos fazer um UPCAST. 
		//Qdo subclasses s�o promovidas a superclasses.
		//A convers�o � impl�cita (ou seja, autom�tica). Gerente � UM Funcionario.
		//Posso guardar um Gerente dentro de um Funcionario.
		//Posso guardar um ArrayList dentro de um List.
		Funcionario f2 = new Gerente(); //upcast
		
		//Pensando nos tipos primitivos � o mesmo que guardar um int em um double:
		//int a = 10; double x; 
		//x = a; //convers�o impl�cita
		//System.out.println("valor: " + x); // sa�da: valor: 10.0
		
		
		
		//DOWNCAST. Qdo superclasses s�o convertidas em subclasses
		//A convers�o � expl�cita. Tem que indicar o TIPO. 
		//Gerente gerente = (Gerente) f1; //downcast
		
		//Pensando nos tipos primitivos � o mesmo que guardar um double em um int:
		//double a = 25.98; int x; 
		//x = (int)a; //convers�o expl�cita (cast)
		//System.out.println("valor: " + x); // sa�da: valor: 25
		
		//Operador instanceof. Verifica se o objeto � do tipo da subclasse
		Funcionario f3 = new Gerente(10, "Ana", 5000.0f);
		if (f3 instanceof Gerente) {
			System.out.println("� um gerente");
		}
		
	}

}
