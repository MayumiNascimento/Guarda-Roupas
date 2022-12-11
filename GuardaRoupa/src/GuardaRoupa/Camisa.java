package GuardaRoupa;

public class Camisa extends Vestimenta{
	
	private int numero;
	private String tipo;
	
	public Camisa(String cor, String tecido, int cont, int numero, String tipo) {
		super(cor, tecido, cont);
		this.numero = numero;
		this.tipo = tipo;
	}

	public String toString() {
		return "Camisa [Cor = " + getCor() + " Tecido = " + getTecido() + " Numero = " + numero + " Tipo = " + tipo + "]";
	}

}
