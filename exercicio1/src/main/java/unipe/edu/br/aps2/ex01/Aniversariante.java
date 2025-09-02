package unipe.edu.br.aps2.ex01;

public class Aniversariante extends DataAniversario {
	
	private String nome;
	private DataAniversario dataAniversario;
		
	//gets e sets...	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public DataAniversario getDataAniversario() {
		return dataAniversario;
	}
	public void setDataAniversario(DataAniversario dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	
	
	//QUESTÃO 1
	@Override
	public boolean equals(Object outroAniversariante) {
		if (outroAniversariante instanceof Aniversariante) {
			Aniversariante copiaAniversariante = (Aniversariante) outroAniversariante;
			boolean confirmandoData = copiaAniversariante.getDia() == this.getDia() && copiaAniversariante.getMes() == this.getMes();
			return confirmandoData && copiaAniversariante.nome == this.nome;
		}
		return false;
	}
	
	//QUESTÃO 2 (a e b)
	public void Aniversariante(String nome, int dia, int mes) {
		this.nome = nome;
		this.setDia(dia);
		this.setMes(mes);
	}
	
	public void Aniversariante(String nome, DataAniversario dataAniversario) {
		this.nome = nome;
		this.dataAniversario = dataAniversario;
	}

}