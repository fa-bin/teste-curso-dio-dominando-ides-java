package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
	public static void main(String[] args) {
		Gato gato = new Gato();
		Livros livros = new Livros();
		System.out.println(gato);
		System.out.println(livros);
	
	}
}






/*
String a = "Hello";
String b = "World";
System.out.printf("%s %s", a, b);
*/

class Livros {
	private String nome;
	private String npag;
};