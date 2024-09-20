package Atividades3_e_4;

import java.util.Scanner;

public class Principal_Att3_att4 {
	public static void main(String[] arg) {
		Agenta agenda = new Agenta();
		String nomeArquivo = "contatinho.txt";
		agenda.addContatinho(new Contatinho("Lucas Santos", "LuquinhasSoCapaFF@gmail.com", "472345678", "FreeFire"));
		agenda.salvarLista(nomeArquivo);
		Scanner leitura = new Scanner(System.in);
		System.out.println("Informe um nome para procurar: ");
		String nomeprocura = leitura.nextLine();
		Contatinho contatinho = agenda.lerContatinho(nomeprocura, nomeArquivo);
		// System.out.println(contatinho);
		if (contatinho != null) {
			System.out.println("Contatinho encontrado: ");
			System.out.println("Nome: " + contatinho.getNome());
			System.out.println("Email: " + contatinho.getEmail());
			System.out.println("Telefone: " + contatinho.getTelefone());
			System.out.println("Categoria: " + contatinho.getCategoria());
		} else {
			System.out.println("Contatinho não encontrado!!");
		}
	}
}
