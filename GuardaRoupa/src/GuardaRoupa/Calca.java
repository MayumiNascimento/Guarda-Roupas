package GuardaRoupa;

public class Calca extends Vestimenta{
	
	private int numero;
	
	public Calca(String cor, String tecido, int cont, int numero) {
		super(cor, tecido, cont);
		this.numero = numero;
	}

	public String toString() {
		return "Calça [Cor = " + getCor() + " Tecido = " + getTecido() + " Numero = " + numero + "]";
	}

}
