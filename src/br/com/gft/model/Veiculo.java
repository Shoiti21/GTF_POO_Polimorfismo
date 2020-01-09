package br.com.gft.model;

public class Veiculo {
	private String Marca, Modelo, Placa, Cor;
	private int Km;
	private boolean isLigado;
	protected int LitrosCombustivel, Velocidade;
	private double Preco;
	
	public Veiculo(String marca, String modelo, String placa, String cor, int km, boolean isligado, int litroscombustivel, int velocidade, double preco) {
		this.Marca=marca;
		this.Modelo=modelo;
		this.Placa=placa;
		this.Cor=cor;
		this.Km=km;
		this.isLigado=isligado;
		this.LitrosCombustivel=litroscombustivel;
		this.Velocidade=velocidade;
		this.Preco=preco;
	}
	public void abastecer(int qtd) {
		this.LitrosCombustivel+=qtd;
		if(this.LitrosCombustivel<0) {
			this.LitrosCombustivel=0;
		}
	}
	public void acelerar() {
		if(this.isLigado==true) {
			this.LitrosCombustivel--;
			this.Velocidade+=this.Km;
		}
	}
	public String getMarca() {
		return this.Marca;
	}

	public String getModelo() {
		return this.Modelo;
	}

	public String getPlaca() {
		return this.Placa;
	}

	public String getCor() {
		return this.Cor;
	}

	public float getKm() {
		return this.Km;
	}

	public boolean isLigado() {
		return this.isLigado;
	}

	public int getLitrosCombustivel() {
		return this.LitrosCombustivel;
	}

	public int getVelocidade() {
		return this.Velocidade;
	}

	public double getPreco() {
		return this.Preco;
	}
}
