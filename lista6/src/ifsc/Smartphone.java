package ifsc;

public class Smartphone extends Produto {

	private String dimensoesTela;
	private Long memoria;

	public Long getMemoria() {
		return memoria;
	}

	public void setMemoria(Long memoria) {
		this.memoria = memoria;
	}

	public String getDimensoesTela() {
		return dimensoesTela;
	}

	public void setDimensoesTela(String dimensoesTela) {
		this.dimensoesTela = dimensoesTela;
	}

}
