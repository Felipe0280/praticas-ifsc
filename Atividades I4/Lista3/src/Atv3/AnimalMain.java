package Atv3;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal capybara = new Animal();
		capybara.nomecientifico = "Hydrochoerus hydrochaeris";
		capybara.familia = "Caviidae";
		capybara.reino = "animalia";
		capybara.nomesmaisusados = new String [5];
		capybara.nomesmaisusados[0] = "Capivara";
		capybara.nomesmaisusados[1] = "Capybara";
		capybara.nomesmaisusados[2] = "Rato Grande";
		capybara.nomesmaisusados[3] = "Rato do rio";
		capybara.nomesmaisusados[4] = "Charles";
		
		System.out.println(capybara.nomecientifico);
		System.out.println(capybara.familia);
		System.out.println(capybara.familia);
		System.out.println(capybara.nomesmaisusados[0]);
		System.out.println(capybara.nomesmaisusados[1]);
		System.out.println(capybara.nomesmaisusados[2]);
		System.out.println(capybara.nomesmaisusados[3]);
		System.out.println(capybara.nomesmaisusados[4]);
	}

}
