package br.edu.inpettecc.models;

public class Marca {
	private String nome;
	private String paisOrigem;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	@Override
	public String toString() {
		return "Marca [nome=" + nome + ", paisOrigem=" + paisOrigem + "]";
	}
	
}
