package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		Cofrinho cofrinho = new Cofrinho();
		
		System.out.println("COFRINHO");
		System.out.println("1- Adicionar Moedas");
		System.out.println("2- Remover Moedas");
		System.out.println("3- Listar Moedas");
		System.out.println("4- Total de Moedas em Real");
		System.out.println("0- Encerrar");
		opcao = teclado.nextInt();
				
		while(opcao != 0) {
			switch(opcao) {
			case 1:
				int tipo = 0;
				double valor = 0;
				while(tipo > 3 || tipo <= 0) {
					System.out.println("ADICIONAR MOEDA");
					System.out.println("1- Real");
					System.out.println("2- Dolar");
					System.out.println("3- Euro");
					tipo = teclado.nextInt();
				}
				System.out.println("Digite o valor.");
				if(tipo == 1) {
					valor = teclado.nextDouble();
					cofrinho.adicionar(new Real(valor));
				}
				if(tipo == 2) {
					valor = teclado.nextDouble();
					cofrinho.adicionar(new Dolar(valor));
				}
				if(tipo == 3){
					valor = teclado.nextDouble();
					cofrinho.adicionar(new Euro(valor));
				}
				break;
				
			case 2:
				int op = 0;
				double valor2 = 0;
				while(op > 3 || op <= 0) {
					System.out.println("REMOVER MOEDA");
					System.out.println("1- Real");
					System.out.println("2- Dolar");
					System.out.println("3- Euro");
					op = teclado.nextInt();
				}
				System.out.println("Digite o valor.");
				if(op == 1) {
					valor2 = teclado.nextDouble();
					cofrinho.remover(new Real(valor2));
				}
				else if(op == 2) {
					valor2 = teclado.nextDouble();
					cofrinho.remover(new Dolar(valor2));
				}
				else if(op == 3){
					valor2 = teclado.nextDouble();
					cofrinho.remover(new Euro(valor2));
				}
				break;
				
			case 3: 
				cofrinho.listar();
				break;
			
			case 4:
				cofrinho.totalConvertido();
				break;

			default:
				System.out.println("OPCAO INVALIDA!");
			}
			
			System.out.println("COFRINHO");
			System.out.println("1- Adicionar Moedas");
			System.out.println("2- Remover Moedas");
			System.out.println("3- Listar Moedas");
			System.out.println("4- Total de Moedas em Real");
			System.out.println("0- Encerrar");
			opcao = teclado.nextInt();
		}
		
		System.out.println("Cofrinho Encerrado.");
	}
}
