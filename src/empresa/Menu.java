package empresa;

import java.util.Scanner;

public class Menu {
	private final Scanner teclado = new Scanner(System.in);
	public final int REAL = 1;
	public final int DOLAR = 2;
	public final int EURO = 3;
	
	protected int mostrarMenuPrincipal() {
		System.out.println("COFRINHO");
		System.out.println("1- Adicionar Moedas");
		System.out.println("2- Remover Moedas");
		System.out.println("3- Listar Moedas");
		System.out.println("4- Total de Moedas em Real");
		System.out.println("0- Encerrar");
		return teclado.nextInt();
	}
	
	protected int mostrarMenuAdicionar(String titulo) {
		int tipo = 0;
		while(tipo > 3 || tipo <= 0) {
			System.out.println(titulo);
			System.out.println("1- Real");
			System.out.println("2- Dolar");
			System.out.println("3- Euro");
			tipo = teclado.nextInt();
		}
		return tipo;
	}
	
	protected Scanner getTeclado() {
		return teclado;
	}
	
}
