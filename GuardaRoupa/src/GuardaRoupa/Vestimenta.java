package GuardaRoupa;

public class Vestimenta {
	
	private String cor;
	private String tecido;
	private int cont;
	
	
	public Vestimenta(String cor, String tecido, int cont) {
		super();
		this.cor = cor;
		this.tecido = tecido;
		this.cont = cont;
	}

	public int obterNumeroDeVestimentas(){
		return cont;
	}

	public String toString() {
		return "Vestimenta [Cor = " + getCor() + ", Tecido = " + tecido + "]";
	}

	public String getCor() {
		return cor;
	}
	
	public String getTecido() {
		return tecido;
	}
}
