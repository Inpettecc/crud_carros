package br.edu.inpettecc.models;

public class Carro {
	private String cor;
	private String modelo;
	private Marca marca;
	private String ano;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	@Override
	public String toString() {
		return "Carro [cor=" + cor + ", modelo=" + modelo + ", marca=" + marca.getNome()
				+ ", ano=" + ano + "]";
	}
	
	
}
