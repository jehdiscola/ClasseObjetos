package br.com.generation.classeobjeto;

public class TestaAviao {

	public static void main(String[] args) {
		
		Aviao aviao = new Aviao();
		
		aviao.nome = "Boing 646";
		aviao.marca = "Airbus A300";
		aviao.modelo = "VC-25";
		aviao.ciaAerea = "Swissair";
		aviao.ano = 2020;
		aviao.quantidadePassageiros = 366;
		
		System.out.println("O nome do aeronave �: " + aviao.nome);
		System.out.println("A marca da aerononave �: " + aviao.marca);
		System.out.println("Seu modeo �: " + aviao.modelo);
		System.out.println("A CIA �erea � a: " + aviao.ciaAerea);
		System.out.println("Seu ano de fabrica��o �: " + aviao.ano);
		System.out.println("Na aeronave cabem: " + aviao.quantidadePassageiros + " passageiros.");
		
		
				
		
		
		
				
		

	}

}
