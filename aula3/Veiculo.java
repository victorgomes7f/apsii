package aula03;

public class Veiculo {
    
    private String modelo;
    private int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    void imprimirDetalhes() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }

}
