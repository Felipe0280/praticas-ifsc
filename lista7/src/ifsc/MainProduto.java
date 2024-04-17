package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		
		ArrayList<Desktop> desktops = new ArrayList<>();
		
		Desktop d1 = new Desktop();
		d1.setFabricante("Amd");
		d1.setCodBarras((long) 134759);
		d1.setGamer(true);
		ArrayList<String> pecas1 = new ArrayList<>();
		pecas1.add("Mouse Cobra");
		pecas1.add("muito RGB");
		pecas1.add("mais um pouco de RGB");
		d1.setPecas(pecas1);
		desktops.add(d1);
		
		Desktop d2 = new Desktop();
		d2.setFabricante("Intel");
		d2.setCodBarras((long) 7683490);
		d2.setGamer(true);
		ArrayList<String> pecas2 = new ArrayList<>();
		pecas2.add("Mouse Xshark3");
		pecas2.add("Monitor 240hrz, 1ms");
		pecas2.add("placa de video 4070ti ");
		d2.setPecas(pecas2);
		desktops.add(d2);
		
		Desktop d3 = new Desktop();
		d3.setFabricante("dell");
		d3.setCodBarras((long) 134759);
		d3.setGamer(false);
		ArrayList<String> pecas3 = new ArrayList<>();		
		pecas3.add("Intel i3-31270g");
		pecas3.add("Monitor hp algum ae");
		pecas3.add("placa de video integrada");
		d3.setPecas(pecas3);
		desktops.add(d3);
		
		for (Desktop Desktop : desktops) {
			System.out.println(Desktop.getFabricante());
			System.out.println(Desktop.getCodBarras());
			System.out.println(Desktop.getGamer());
			for (String Pecas : Desktop.getPecas() ) {
				System.out.println(Pecas);
			}	
		} 
		ArrayList<Smartphone> smartphones = new ArrayList<>();
		
		Smartphone s1 = new Smartphone();
		s1.setFabricante("Sansung");
		s1.setCodBarras((long)208490139);
		s1.setDimensoesTela("430x250");
		s1.setMemoria((long)124);
		smartphones.add(s1);
		
		Smartphone s2 = new Smartphone();
		s2.setFabricante("Sansung");
		s2.setCodBarras((long)208490139);
		s2.setDimensoesTela("430x250");
		s2.setMemoria((long)124);
		smartphones.add(s2);
		
		Smartphone s3 = new Smartphone();
		s3.setFabricante("Sansung");
		s3.setCodBarras((long)208490139);
		s3.setDimensoesTela("430x250");
		s3.setMemoria((long)124);
		smartphones.add(s3);
		for (Smartphone smartphone : smartphones) {
			System.out.println(smartphone.getFabricante());
			System.out.println(smartphone.getCodBarras());
			System.out.println(smartphone.getDimensoesTela());
			System.out.println(smartphone.getMemoria());
		}
	}

}
