package aula03;

public class Carro extends Veiculo {
	
	private int numPortas;
	
	public Carro(String modelo, int ano, int numPortas) {
		super(modelo,ano);
		this.numPortas = numPortas;
	}

	@Override
	public void imprimirDetalhes() {
		// TODO Auto-generated method stub
		super.imprimirDetalhes();
		System.out.println("Num. de portas: " + this.numPortas);
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	
}
