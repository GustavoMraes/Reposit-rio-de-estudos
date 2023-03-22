// A classe Collections é focada em funcionalidades sobre listas. Para isso, ela usa exclusivamente métodos estáticos, que focam em retornar valores destas listas.
// A classe Collections foi implementada na versão 1.2 do Java.

import java.util.ArrayList;
import java.util.Collections;

class Exercicio1{
    public Exercicio1(){
    ArrayList<String> nomes = new ArrayList<String>();

    nomes.add("Gustavo"); 
    nomes.add("Bernardo");
    nomes.add("Matheus");
   
    System.out.println(Collections.max(nomes));
    Collections.reverse(nomes);
    Collections.sort(nomes);
    System.out.println(nomes);



    }

}