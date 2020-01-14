package br.com.gft.model;

public class Caminhao extends Veiculo{
	public Caminhao(String marca, String modelo, String placa, String cor, int km, boolean isligado, int litroscombustivel, int velocidade, double preco) {
		super(marca,modelo,placa,cor,km,isligado,litroscombustivel,velocidade,preco);
	}
	public void abastecer(float qtd) {
		super.abastecer((int)qtd);
		if(super.LitrosCombustivel>150) {
			super.LitrosCombustivel=150;
		}
	}
	public void acelerar() {
		super.acelerar();
	}
}
