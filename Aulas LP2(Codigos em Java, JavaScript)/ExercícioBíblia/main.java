import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class main
{
    public static void main(String[] args) {    

        FileReader in = null;    
        FileWriter out = null;   
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> mapa = new HashMap<String, Integer>();
        Map<String, Integer> mapaOrdenado = new HashMap<String, Integer>();
        System.out.println("Digite o nome do arquivo txt");
        StringTokenizer st;
        String palavra ="";
        int quantidadePalavrasPequenas=0;
        int palavrasComecamA = 0; int palavrasComecamE = 0; int palavrasComecamI = 0; int palavrasComecamO = 0; int palavrasComecamU = 0;
        int quantidadeCrases = 0;
        int contagem=0;
        int terminaAO=0;       
        int c = 0;

        ArrayList<Character> lista = new ArrayList<Character>();
        char caractere = 'a';
        String biblia = "";


        try
        {

            lista.add(';');
            lista.add(',');
            lista.add('.');
            lista.add('?');
            lista.add('!');
            lista.add(':');
            lista.add('1');
            lista.add('2');
            lista.add('3');
            lista.add('4');
            lista.add('5');
            lista.add('6');
            lista.add('7');
            lista.add('8');
            lista.add('9');
            lista.add('0');











            out = new FileWriter("resultado.txt");
            in = new FileReader (scan.nextLine());


            while((c=in.read())!=-1)
            {
                caractere = (char)c;

                if (caractere=='à')
                quantidadeCrases += 1;

                if(!lista.contains(caractere))
                biblia = biblia+caractere; 

            }
            st = new StringTokenizer(biblia);

            for (int i =0; i<=st.countTokens(); i++)
            {
                contagem = 1;
                palavra = st.nextToken();
                palavra = palavra.toLowerCase();

                //Verificações
                if(palavra.length()<=3)
                quantidadePalavrasPequenas = quantidadePalavrasPequenas+1;

                if(palavra.endsWith("ão"))
                terminaAO += 1;


                if (palavra.charAt(0) == 'a')
                palavrasComecamA += 1;

                if (palavra.charAt(0) == 'e')
                palavrasComecamE += 1;
                
                if (palavra.charAt(0) == 'i')
                palavrasComecamI += 1;

                if (palavra.charAt(0) == 'o')
                palavrasComecamO += 1;

                if (palavra.charAt(0) == 'u')
                palavrasComecamU += 1;


                //COLOCAR NO MAPA
                mapa.put(st.nextToken(), 1);;

                //Substituir o contador para aumentar
                if(palavra.length()>3)  
                {              
                if(mapa.containsKey(palavra))
                {
                    contagem = mapa.get(palavra)+1;
                    mapa.put(st.nextToken(), contagem);
                }  
                }    
                
                
               
                mapaOrdenado = mapa.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));



            } 

            System.out.println("Quantidade de palavras de até 3 letras: "+ quantidadePalavrasPequenas + "\nQuantidade de palavras que começam com A:" + palavrasComecamA+ "\nQuantidade de palavras que começam com E:" + palavrasComecamE + "\nQuantidade de palavras que começam com I:" + palavrasComecamI + "\nQuantidade de palavras que começam com O:" + palavrasComecamO + "\nQuantidade de palavras que começam com U:" + palavrasComecamU );
            System.out.println("Quantidade de palavras diferentes: " + mapa.size());
            System.out.println("Quantidade de crases: " + quantidadeCrases);    
            System.out.println("Quantidade de palavras que termia ÃO: " + terminaAO);



            int w = 0;
            for (String a : mapaOrdenado.keySet()){

                if( w++ <= 5 ) 
                {
                     System.out.println("Palavra: "+ a + " - " +mapaOrdenado.get(a));
                     System.out.println("------------------");
                }
                if (w>= (mapaOrdenado.size()-5))
                {
                System.out.println("Palavra: "+ a + " - " +mapaOrdenado.get(a));
                System.out.println("------------------");
                }
            }

           

            




            
            
        }   

      


       catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                out.close();
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
}