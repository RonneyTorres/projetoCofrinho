package empresa;

public class Dolar extends Moeda{
	//classe filha que herda o contrutor, metodo info e converter.
	
	public Dolar(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.printf("Dolar: %.2f", valor);
		System.out.println();
	}

	@Override
	public double converter() {
		double cotacao = 4.79; //Utilizei o valor da cotação atual da moeda.
		double valorDolar = valor * cotacao;
		return valorDolar;
	}	
}
