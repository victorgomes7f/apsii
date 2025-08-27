package aula03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Carro c1 = new Carro("Modelo A", 2000, 4);
		Moto m1 = new Moto("Modelo B", 2020, 10);
		
		System.out.println("Modelo: ");
		c1.setModelo(teclado.nextLine());
		
		System.out.println("Ano: ");
		c1.setAno(teclado.nextInt());
		
		System.out.println("Num. de portas: ");
		c1.setNumPortas(teclado.nextInt());
		
		c1.imprimirDetalhes();
		
	}

}
