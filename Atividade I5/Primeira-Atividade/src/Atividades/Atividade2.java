package Atividades;

import java.io.File;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite o numero do arquivo com a tabuada q vc deseja procurar: ");
		int numArquivo = leitura.nextInt();
		File f1 = new File("tabuada_"+numArquivo+".txt");
		
		if(f1.exists()) {
			System.out.println("Arquivo encontrado!");
		}else {
			System.out.println("Arquivo nao existe!");
		}
	}

}
