package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Cofrinho cofrinho = new Cofrinho();
		Menu menu = new Menu();
		int opcao = menu.mostrarMenuPrincipal();
		Scanner teclado = new Scanner(System.in);	
		
		while(opcao != 0) {
			switch(opcao) {
			case 1:
				int tipo = menu.mostrarMenuAdicionar("Adicionar Moeda");
				System.out.println("Digite o valor.");
				double valor = menu.getTeclado().nextDouble();
				
				
				if(tipo == menu.REAL) {
					cofrinho.adicionar(new Real(valor));
				}else if(tipo == menu.DOLAR) {
					cofrinho.adicionar(new Dolar(valor));
				}else if(tipo == menu.EURO){
					cofrinho.adicionar(new Euro(valor));
				}
				break;
				
			case 2:
				int tipo = menu.mostrarMenuAdicionar("Remover Moeda");
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
			
			opcao = cofrinho.mostrarMenuPrincipal();
		}
		
		System.out.println("Cofrinho Encerrado.");
	}
}
