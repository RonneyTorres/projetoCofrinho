package empresa;

public abstract class Moeda {
	double valor;
	
	public Moeda(double valor) {
		this.valor = valor;
	}
	
	// Método equals é o método que irá fazer as comparações quando chamar o método remover, que vai ser pelo objeto e não pelo índice.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}


	// Método abstrato que as classes filhas herdarão.
	// Método info retorna as informações de cada moeda
	abstract void info();
	// Método converter ira converter as moedas para real.
	abstract double converter();
	
}
