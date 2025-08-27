package aula03;

public class Moto extends Veiculo {
	
	private int cilindradas;
	
	public Moto(String modelo, int ano, int cilindradas) {
		super(modelo, ano);
		this.cilindradas = cilindradas;
	}

	@Override
	public void imprimirDetalhes() {
		// TODO Auto-generated method stub
		super.imprimirDetalhes();
		System.out.println("Cilindradas: " + this.cilindradas);
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
}
