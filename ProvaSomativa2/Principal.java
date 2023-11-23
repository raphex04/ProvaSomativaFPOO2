package ProvaSomativa2;

public class Principal {
	public static void main(String[] args) {
		
		Livro livro = new Livro ("Rafael", "Rafael", 227);
		System.out.println("Nome: " + livro.getNome());
		System.out.println("Autor: " + livro.getAutor());
		System.out.println("Paginas: "+ livro.getPaginas());
		
	}
}