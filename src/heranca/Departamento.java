package heranca;

import java.util.ArrayList;

public class Departamento {
	//atributo
	private static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
	
	//método GET
	public static ArrayList<Funcionario> getListaFuncionarios(){
		return listaFuncionarios;
	}

	//adiciona um objeto Funcionario na lista
	public static void adicionar(Funcionario f) {
		listaFuncionarios.add(f);
	}
	
	//lista os dados de todos os objetos da lista
		public static String listar() {
			String saida =  "";
			int i = 1;
			for (Funcionario f: listaFuncionarios) {
				saida = saida + "\n========== FUNCIONÁRIO Nº " + (i++) + " ========\n"; 
				saida = saida + f.imprimir() + "\n";
			}
			
			return saida;
		}
}
