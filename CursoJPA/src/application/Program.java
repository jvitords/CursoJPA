package application;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "João", "joao@gmail.com");
		Pessoa p2 = new Pessoa(2, "Vitor", "vitor@gmail.com");
		Pessoa p3 = new Pessoa(3, "Duarte", "duarte@gmail.com");
		Pessoa p4 = new Pessoa(4, "Santos", "santos@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}

}
