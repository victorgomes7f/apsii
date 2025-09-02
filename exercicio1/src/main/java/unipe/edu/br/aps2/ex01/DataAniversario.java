package unipe.edu.br.aps2.ex01;

public class DataAniversario {
	
	private int dia;
	private int mes;

	public void DataAniversario(int dia, int mes) {
		this.dia = dia;
		this.mes = mes;
	}
		
	// gets e sets…
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}	
	
	public boolean equals(Object outraData) {
		if (outraData instanceof DataAniversario){
			DataAniversario outraDataAniversario = (DataAniversario) outraData;
			return (outraDataAniversario.dia == this.dia && outraDataAniversario.mes == this.mes);
		}
		return false;
	}
	
	public String toString() {
		return this.dia+"/"+this.mes;
	}
	
}