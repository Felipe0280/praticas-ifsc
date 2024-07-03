package ifsc;

public class Veiculo {
	
	private String nome;
	private Integer ano;
	private Integer numerodaroda;
	private String fabricante;
	private String cor;
	
	public String getNome() {
		return nome;
	}
	public Integer getNumerodaroda() {
		return numerodaroda;
	}
	public void setNumerodaroda(Integer numerodaroda) {
		this.numerodaroda = numerodaroda;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
}
