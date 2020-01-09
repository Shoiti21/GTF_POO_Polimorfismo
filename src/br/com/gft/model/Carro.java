package br.com.gft.model;

public class Carro extends Veiculo{
	public Carro(String marca, String modelo, String placa, String cor, int km, boolean isligado, int litroscombustivel, int velocidade, double preco) {
		super(marca,modelo,placa,cor,km,isligado,litroscombustivel,velocidade,preco);
	}
	public void abastecer(int qtd) {
		super.abastecer(qtd);
		if(super.LitrosCombustivel>100) {
			super.LitrosCombustivel=100;
		}
	}
	public void acelerar() {
		super.acelerar();
	}
}
