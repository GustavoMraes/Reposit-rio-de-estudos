import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

	private ArrayList<Carro> lista;
	private Scanner sc;
	
	public Cadastro() {

		lista = new ArrayList<Carro>();	
		sc = new Scanner(System.in);
		Integer opcao = 0;
		
		do {
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Sair");
			System.out.println("Digite sua opção:");
			opcao = sc.nextInt();
			switch( opcao ) {
				case 1:
					cadastrar();
					break;
				case 2:
					listar();
					break;
				case 3:
					sair();
					break;
			}
			System.out.println("---------------------------");			
		}while( opcao < 3 );
		
	}
	
	public void cadastrar() {
		System.out.println("Cadastrar");
		System.out.println("Digite a marca:");
		String marca = sc.next();
		System.out.println("Digite a modelo:");
		String modelo = sc.next();
		System.out.println("Digite a cor:");
		String cor = sc.next();
		lista.add( new Carro(marca,modelo,cor) );		
	}
	public void listar() {
		System.out.println("Listar");
		for(Carro x: lista )
			System.out.println( x.toString() );
	}
	public void sair() {
		System.out.println("Sair");
	}
	
}