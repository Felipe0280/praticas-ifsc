package Atividades3_e_4;

	import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;
	
public class Agenta {

	public static void main(String[] args) {}
		private List<Contatinho> contato;
		
		public Agenta(){
			this.contato = new ArrayList<>();
		}
		
		public void addContatinho(Contatinho contatinho1) {
			this.contato.add(contatinho1);
		}
		
		public void ordenarLista() {
			Collections.sort(contato, Comparator.comparing(Contatinho::getNome));
		}
		
		public void salvarLista(String nomeArq) {
			ordenarLista();
			try (BufferedWriter a = new BufferedWriter(new FileWriter(nomeArq))) {
				for (Contatinho contatinho : contato) {
					a.write(contatinho.toString());
					a.newLine();
				}
				System.out.println("Lista salva no arquivo: "+nomeArq);
			}catch(Exception e){
				System.out.println("Erro ao salvar arquivo: "+ e.getMessage());
			}
		}
		  public Contatinho lerContatinho(String nome, String nomeArquivo){
			try(BufferedReader ler = new BufferedReader(new FileReader(nomeArquivo))){
				String linha;
				while((linha = ler.readLine())!= null) {
					String[] partes = linha.split("a");
					if(partes.length == 4 && partes[0].equalsIgnoreCase(nomeArquivo)) {
						return new Contatinho(partes[0],partes[1],partes[2],partes[3]);
					}
				}
			}catch(IOException e) {
				System.out.println("Erro ao ler o arquivo: "+ e.getMessage());
			}
		}
			
}
