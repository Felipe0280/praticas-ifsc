package Atv2;

import java.util.Iterator;
import java.util.Scanner;

import Atv1.Pessoa;

public class PessoaMainB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa[] p = new Pessoa[3];
		Scanner leitura = new Scanner(System.in);
		int i;
		for ( i = 0; i < p.length; i++) {
			Pessoa p1 = new Pessoa();
			p1.nome = leitura.nextLine();
			String a = leitura.nextLine();
			p1.cpf = Long.valueOf(a);
			p1.datadeaniver = leitura.nextLine();
			p[i]=p1;
			
		}
		for (i = 0; i < p.length; i++) {
			System.out.println(p[i].nome);
			System.out.println(p[i].cpf);
			System.out.println(p[i].datadeaniver);
		}
	}

}
