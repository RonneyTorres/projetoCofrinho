package empresa;

public class Euro extends Moeda{
	//classe filha que herda o contrutor, metodo info e converter.

	public Euro(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.printf("Euro: %.2f ", valor);
		System.out.println();
	}

	@Override
	public double converter() {
		double cotacao = 5.37; //Utilizei o valor da cotação atual da moeda.
		double valorEuro = valor * cotacao;
		return valorEuro;
	}
}
