package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Cofrinho {
	
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public ArrayList<Moeda> getLista() {
		return listaMoedas;
	}

	public void setLista(ArrayList<Moeda> lista) {
		this.listaMoedas = lista;
	}

	public void adicionar(Moeda valor) {
		listaMoedas.add(valor);
;	}
	
	public void remover(Moeda valor) {
		listaMoedas.remove(valor);
	}
	
	public void listar() {
		for(Moeda todasMoedas : listaMoedas) {
			todasMoedas.info();
		}
	}
	
	public void totalConvertido() {
		double total = 0;
		for(Moeda moedasEmReal : listaMoedas) {
			total += moedasEmReal.converter();
		}
		System.out.printf("Total de Moedas Convertido em real: %.2f\n", total);
	}
	
	
}
