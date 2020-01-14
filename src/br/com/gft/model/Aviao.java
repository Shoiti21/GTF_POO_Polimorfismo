package br.com.gft.model;

public class Aviao extends Veiculo{
	public Aviao(String marca, String modelo, String placa, String cor, int km, boolean isligado, int litroscombustivel, int velocidade, double preco) {
		super(marca,modelo,placa,cor,km,isligado,litroscombustivel,velocidade,preco);
	}
	public void abastecer(String qtd) {
		super.abastecer(Integer.parseInt(qtd));
		if(super.LitrosCombustivel>600) {
			super.LitrosCombustivel=600;
		}
	}
	public void acelerar() {
		super.acelerar();
	}
}
