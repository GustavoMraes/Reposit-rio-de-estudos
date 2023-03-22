import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Collections;
import java.util.Random;

public class Teste {
    public static void main(String[] args){

/*
EXERCÍCIO 1
ArrayList<Integer> lista = new ArrayList<Integer>();
lista.add(1);
lista.add(5);
lista.add(3);
print(lista.get(2));
print(lista.hashCode());
print(lista.size());
lista.clear();
*/


/* 
EXERCÍCIO 2
HashSet<Integer> lista2 = new HashSet<Integer>();
lista2.add(1);
lista2.add(9);
lista2.add(4);
System.out.println(lista2.size());
System.out.println(lista2.isEmpty());
lista2.remove(1);
lista2.clear();
System.out.println(lista2.isEmpty());
*/

/* 
EXERCÍCIO 3
String aluno1 ="Domingos Latorre";
String aluno2 ="Domingos Bernardo";
String aluno3 ="Claudia Miyuki";
String aluno4 ="Domingos Latorre";

System.out.println(Object.equals(aluno1, aluno2));
System.out.println(Object.equals(aluno1, aluno4));

System.out.println(Object.hash(aluno1));
System.out.println(Object.hash(aluno4));
*/

/*
EXERCÍCIO 4
Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		do {
			System.out.println("Digite o valor do elemento " + (lista.size()+1) + " : " );
			Integer valor = sc.nextInt();
			lista.add(valor);
		}
		while( lista.size() < 5 );
		
		for( Integer i: lista )
			System.out.println( i );
		
		sc.close();

    */

    /* 

    ArrayList<Integer> lista = new ArrayList<Integer>();
		
		Random random = new Random();
		
		do {
			lista.add( random.nextInt(1, 100));
		}
		while( lista.size() < 10 );
		
		Integer maior = Collections.max(lista);
		
		Integer menor = Collections.min(lista);
		
		System.out.println("Maior valor: " + maior );
		
		System.out.println("Menor valor: " + menor );

        */


    
    }
}