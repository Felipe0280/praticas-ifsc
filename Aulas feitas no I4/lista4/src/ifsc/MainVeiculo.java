package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		Veiculo a = new Veiculo();
		Veiculo b = new Veiculo();
		Veiculo c = new Veiculo();
		
		a.setNome("Lancer");
		a.setAno(2010);
		a.setNumerodaroda(4);
		a.setFabricante("Mitsubishi");
		a.setCor("Branco");
		
		b.setNome("Celta");
		b.setAno(2000);
		b.setNumerodaroda(4);
		b.setFabricante("Chevrolet");
		b.setCor("Preto");
		
		c.setNome("Prisma");
		c.setAno(2015);
		c.setNumerodaroda(4);
		c.setFabricante("Chevrolet");
		c.setCor("Prata");
		
		ArrayList<Veiculo> v1 = new ArrayList<>();
		v1.add(a);
		v1.add(b);
		v1.add(c);
		
		for (Veiculo veiculo : v1) {
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getNumerodaroda());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getCor());
			System.out.println("");
		}
	}

}
