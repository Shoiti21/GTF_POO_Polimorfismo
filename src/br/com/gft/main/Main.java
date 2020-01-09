package br.com.gft.main;

import br.com.gft.model.Veiculo;
import br.com.gft.model.Carro;
import br.com.gft.model.Caminhao;

import java.util.Scanner;

import br.com.gft.model.Aviao;

public class Main {
	public static void main(String[] args){
		int varAcelerar=0;
		int qtdAbastecerCarro;
		float qtdAbastecerCaminhao;
		String qtdAbastecerAviao;
		boolean isAcelerar;

		Scanner sc=new Scanner(System.in);
		
		/* 
		 carro: A cada acelerada � 20 Km/h e tem 100 litros de combust�vel
		 caminh�o: A cada acelerada � 25 Km/h e tem 150 litros de combust�vel
		 avi�o: A cada acelerada � 60 Km/h e tem 600 litros de combust�vel
		 */
		Carro meucarro=new Carro("Hyundai","HB20","33333","Preto",20,true,100,0,40000.0); 
		Caminhao meucaminhao=new Caminhao("Scania", "R580","25252","Branco",25,true,150,0,100000.0);
		Aviao meuaviao=new Aviao("AIRBUS", "A330 ","55555","Azul",60,true,600,0,300000.0);
		
		while(true) {
			System.out.println("CARRO");
			System.out.println("Marca: "+meucarro.getMarca());
			System.out.println("Modelo: "+meucarro.getModelo());
			System.out.println("Placa: "+meucarro.getPlaca());
			System.out.println("Cor: "+meucarro.getCor());
			System.out.println("LIGADO: "+meucarro.isLigado());
			System.out.println("Combustivel por litro: "+meucarro.getLitrosCombustivel()+"/100");
			System.out.println("Velocidade: "+meucarro.getVelocidade()+" Km/h");
			System.out.println("Pre�o: R$"+meucarro.getPreco());
			System.out.println("_______________________________________________________________");
			System.out.println("CAMINH�O");
			System.out.println("Marca: "+meucaminhao.getMarca());
			System.out.println("Modelo: "+meucaminhao.getModelo());
			System.out.println("Placa: "+meucaminhao.getPlaca());
			System.out.println("Cor: "+meucaminhao.getCor());
			System.out.println("LIGADO: "+meucaminhao.isLigado());
			System.out.println("Combustivel por litro: "+meucaminhao.getLitrosCombustivel()+"/150");
			System.out.println("Velocidade: "+meucaminhao.getVelocidade()+" Km/h");
			System.out.println("Pre�o: R$"+meucaminhao.getPreco());
			System.out.println("_______________________________________________________________");
			System.out.println("AVI�O");
			System.out.println("Marca: "+meuaviao.getMarca());
			System.out.println("Modelo: "+meuaviao.getModelo());
			System.out.println("Placa: "+meuaviao.getPlaca());
			System.out.println("Cor: "+meuaviao.getCor());
			System.out.println("LIGADO: "+meuaviao.isLigado());
			System.out.println("Combustivel por litro: "+meuaviao.getLitrosCombustivel()+"/600");
			System.out.println("Velocidade: "+meuaviao.getVelocidade()+" Km/h");
			System.out.println("Pre�o: R$"+meuaviao.getPreco());
			System.out.println("_______________________________________________________________");
			
			System.out.println("Qual ve�culo voc� deseja acelerar?(Carro, Caminh�o ou Avi�o)");
			String escolha1=sc.next();
			switch(escolha1) {
				case "Carro":
						meucarro.acelerar();
					break;
				case "Caminh�o":
						meucaminhao.acelerar();
					break;
				case "Avi�o":
						meuaviao.acelerar();
					break;
			}
			
			System.out.println("Quem voc� deseja abastecer?(Carro, Caminh�o, Avi�o ou nenhum)");
			String escolha2=sc.next();
			switch(escolha2) {
				case "Carro":
					System.out.println("Quanto deseja abastecer no carro?(resposta boolean)");
					qtdAbastecerCarro=sc.nextInt();
					meucarro.abastecer(qtdAbastecerCarro);
					break;
				case "Caminh�o":
					System.out.println("Quanto deseja abastecer no caminh�o?(resposta boolean)");
					qtdAbastecerCaminhao=sc.nextFloat();
					meucaminhao.abastecer(qtdAbastecerCaminhao);
					break;
				case "Avi�o":
					System.out.println("Quanto deseja abastecer no avi�o?(resposta boolean)");
					qtdAbastecerAviao=sc.next();
					meuaviao.abastecer(qtdAbastecerAviao);
					break;
				case "nenhum":
					break;
			}
		}
	}
}
