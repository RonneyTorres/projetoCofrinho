package empresa;

public class Real extends Moeda { 
	//classe filha que herda o contrutor, metodo info e converter.
	
	public Real(double valor) {
		super(valor);
	}
	
	@Override
	public void info() {
		System.out.printf("Real: %.2f", valor);
		System.out.println();
	}

	@Override
	public double converter() {
		double valorReal = valor;
		return valorReal;
	}
}
