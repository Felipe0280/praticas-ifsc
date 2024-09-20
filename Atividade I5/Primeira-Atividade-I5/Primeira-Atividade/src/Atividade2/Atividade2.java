package Atividade2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite o numero do arquivo com a tabuada q vc deseja procurar: ");
		int numArquivo = leitura.nextInt();
		File f1 = new File("tabuada_"+numArquivo+".txt");
		String nomeArq = "tabuada_"+numArquivo+".txt";
		if(!f1.exists()) {
			System.out.println("Arquivo nao existe!");
		}else {
			try(BufferedReader ler = new BufferedReader(new FileReader(nomeArq))){
				String linha;
				while((linha = ler.readLine()) !=null) {
					System.out.println(linha);
				}
			}catch(IOException e) {
				System.out.println("Ocorreu um erro!");
			}finally {
				leitura.close();
			}
		}
	}

}
