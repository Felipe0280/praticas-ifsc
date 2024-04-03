package Atv1;

public class PessoaMainA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa a = new Pessoa();
		
		a.nome = "larissa";
		a.cpf = (long)23102021;
		a.datadeaniver = "24/04";
		
		System.out.println(a.nome);
		System.out.println(a.cpf);
		System.out.println(a.datadeaniver);
		
		Pessoa b = new Pessoa();
		
		b.nome = "Felipe";
		b.cpf = (long)20211023;
		b.datadeaniver = "28/03";
		
		System.out.println(b.nome);
		System.out.println(b.cpf);
		System.out.println(b.datadeaniver);
		
		Pessoa c = new Pessoa();
		
		c.nome = "Willy";
		c.cpf = (long)666;
		c.datadeaniver = "14/04";
		
		System.out.println(c.nome);
		System.out.println(c.cpf);
		System.out.println(c.datadeaniver);
	}

}
