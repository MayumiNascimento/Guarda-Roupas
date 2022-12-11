package GuardaRoupa;

public class Vestido extends Vestimenta {
	
	private boolean longo;
	
	public Vestido(String cor, String tecido, int cont, boolean longo) {
		super(cor, tecido, cont);
		this.longo = longo;
	}
	

	public String toString() {
		return "Vestido [Cor = " + getCor() + " Tecido = " + getTecido() + " Longo? = " + longo + "]";
	}
}
