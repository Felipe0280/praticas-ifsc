package ifsc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Gato a = new Gato();
		a.setClasse("perça");
		a.setNomeCientifico("gatios odiosos");
		a.setPedigree("NS");
		a.setApelido("Bilu");
		
		Gato b = new Gato();
		b.setClasse("Branco");
		b.setNomeCientifico("gatios miudos");
		b.setPedigree("NS");
		b.setApelido("Branco");
		
		Gato c = new Gato();
		c.setClasse("Snowshoe");
		c.setNomeCientifico("gatios gorduchos");
		c.setPedigree("NS");
		c.setApelido("Gato gordo (ou pros intimos shano) ");
		
		
		Tutor d = new Tutor();
		d.setNomeCompleto("Carlos Eduardo Mess");
		d.setGato(a);
		
		Tutor e = new Tutor();
		e.setNomeCompleto("Filipe Rafael Alves Perreira");
		e.setGato(b);
		
		Tutor f = new Tutor();
		f.setNomeCompleto("Larissa Vieira de Sousa Lopes");
		f.setGato(c);
		
		ArrayList<Tutor> lista1 = new ArrayList<>();
		
		lista1.add(d);
		lista1.add(e);
		lista1.add(f);
		
		for (Tutor tutor : lista1) {
			System.out.println(tutor.getNomeCompleto());
			System.out.println(tutor.getGato().getClasse());
			System.out.println(tutor.getGato().getNomeCientifico());
			System.out.println(tutor.getGato().getPedigree());
			System.out.println(tutor.getGato().getApelido()+"\n");
		}
		
	}

}
