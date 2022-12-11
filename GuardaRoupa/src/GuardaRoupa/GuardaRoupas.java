package GuardaRoupa;

import java.util.Scanner;

public class GuardaRoupas{
	
	private int numVestidos;
	private int numCalcas;
	private int numCamisas;
	private Vestido[] vestidos;
	private Calca[] calcas;
	private Camisa[] camisas;


	public GuardaRoupas() {
		super();
        this.vestidos = new Vestido[50];
        this.calcas = new Calca[50];
        this.camisas = new Camisa[50];
	}
	
	public void guardar(String cor, String tecido, int cont, boolean longo) {
		this.numVestidos++;
		for (int i = 0; i < numVestidos; i++) {
			if(this.vestidos[i] == null) {
				Vestido vestido = new Vestido(cor, tecido, cont, longo);
				this.vestidos[i] = vestido;
				System.out.println("Vestido guardado!");
			}
		}
	}
	
	public void guardar(String cor, String tecido, int cont, int numero) {
		this.numCalcas++;
		for (int i = 0; i < numCalcas; i++) {
			if(this.calcas[i] == null) {
				Calca calca = new Calca(cor, tecido, cont, numero);
				this.calcas[i] = calca;
				System.out.println("Calça guardada!");
			}
		}
	}
	
	public void guardar(String cor, String tecido, int cont, int numero, String tipo) {
		this.numCamisas++;
		for (int i = 0; i < numCamisas; i++) {
			if(this.camisas[i] == null) {
				Camisa camisa = new Camisa(cor, tecido, cont, numero, tipo);
				this.camisas[i] = camisa;
				System.out.println("Camisa guardada!");
			}
		}
	}
	
	public void listar() {
		System.out.println("\tListagem do Guarda Roupa:");
    	System.out.println("1. Vestidos: ");
        for (int i = 0; i < numVestidos; i++) {
            if (this.vestidos[i] != null) {
                System.out.println(this.vestidos[i].toString() + "\n");
            }
        }
        System.out.println("2. Calças: ");
        for (int i = 0; i < numCalcas; i++) {
            if (this.calcas[i] != null) {
                System.out.println(this.calcas[i].toString() + "\n");
            }
        }
        System.out.println("3. Camisas: ");
        for (int i = 0; i < numCamisas; i++) {
            if (this.camisas[i] != null) {
                System.out.println(this.camisas[i].toString() + "\n");
            }
        }
        System.out.println();
	}

	public static void main(String[] args) {
		GuardaRoupas g = new GuardaRoupas();
		
		boolean longo = false;
		int numero;
		String tipo;
		String cor;
		String tecido;
		String slongo;
		int cont = 0;
		
		 int opcao = 0;
	     Scanner entrada = new Scanner(System.in);
		
	     while(opcao !=8){
        	System.out.println("\tGuarda Roupa");

            System.out.println("1. Guardar vestido");
            System.out.println("2. Guardar calça");
            System.out.println("3. Guardar camisa");
            System.out.println("4. Listar Guarda Roupa");
            System.out.println("8. Sair");
            System.out.println("Opcao: ");
            
            opcao = entrada.nextInt();
            
            if(opcao == 1) {
            	System.out.println("Informe a cor do vestido: ");
				cor = entrada.next();
				System.out.println("Informe o tecido do vestido: ");
				tecido = entrada.next();
				
				//auxiliar para controle do while (validação)
				int aux = 0;
				while(aux !=3) {
					
					System.out.println("O vestido é longo?(sim/nao): ");
					slongo = entrada.next();
					if(slongo.equalsIgnoreCase("sim") || slongo.equalsIgnoreCase("s") ) {
						longo = true;
						aux =3;
					}
					else if(slongo.equalsIgnoreCase("nao") || slongo.equalsIgnoreCase("n")){
						longo = false;
						aux = 3;
					}
					else{
						System.out.println("Opção inválida");
					}
				}
				cont ++;
            	g.guardar(cor, tecido, cont, longo);
            }
            
            else if (opcao == 2) {
            	System.out.println("Informe a cor da calça: ");
				cor = entrada.next();
				System.out.println("Informe o tecido da calça: ");
				tecido = entrada.next();
				System.out.println("Informe o numero da calça: ");
				numero = entrada.nextInt();
				cont ++;
            	g.guardar(cor, tecido, cont, numero);
			}
            
            else if (opcao == 3) {
            	System.out.println("Informe a cor da camisa: ");
				cor = entrada.next();
				System.out.println("Informe o tecido da camisa: ");
				tecido = entrada.next();
				System.out.println("Informe o numero da camisa: ");
				numero = entrada.nextInt();
				System.out.println("Informe o tipo da camisa: ");
				tipo = entrada.next();
				cont ++;
            	g.guardar(cor, tecido, cont, numero, tipo);
			}
            
			else if (opcao == 4) {
				g.listar();
				System.out.println("Quantidade de vestimentas: " + cont + "\n");
			}
	     }
	     System.out.println("Saindo...");
	}
}