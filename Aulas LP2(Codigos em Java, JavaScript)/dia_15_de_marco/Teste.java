import java.util.ArrayList;
import java.util.HashSet;
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



HashSet<Integer> lista2 = new HashSet<Integer>();
lista2.add(1);
lista2.add(9);
lista2.add(4);
System.out.println(lista2.size());
System.out.println(lista2.isEmpty());
lista2.remove(1);
lista2.clear();


    }
}