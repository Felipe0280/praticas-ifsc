package Atividades1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner (System.in);
		//salvar o numero
		
		System.out.println("Digite o numero que vc deseja ter a tabuada: ");
		int num = leitura.nextInt();
		
		String nome ="tabuada_"+num+".txt";
		try(BufferedWriter escrita = new BufferedWriter(new FileWriter(nome))){
			for(int i = 1;i<= 10; i++) {
				escrita.write(num + "x"+ i +"="+(num*i));
				escrita.newLine();
			}
			System.out.println("Arquivo "+nome+" com a tabuada salvo!");
		}catch (IOException e) {
			System.out.println("Erro na escrita do arquivo: ");
			e.getMessage();			
		}finally {
			leitura.close();
		}
	}

}
