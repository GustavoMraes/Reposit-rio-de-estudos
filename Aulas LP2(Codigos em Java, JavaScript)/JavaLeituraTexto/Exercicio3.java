
import java.io.FileReader;
import java.io.IOException;


public class Exercicio3 {
    public static void main(String[] args) {
        
        
        FileReader in = null;
        int vogais =0;
        int consoantes=0;
        int estranhos=0;
        

        try {            
            int c;
            
            
            char correspondente;

            in = new FileReader("entrada.txt");
            
            while((c=in.read())!=-1)
            {
                correspondente = (char)c;
                Character.toLowerCase(correspondente);             
                if(correspondente=='a'|| correspondente=='e' ||correspondente=='i'|| correspondente=='o'|| correspondente=='u'){
                vogais += 1;
                }else
                if(correspondente=='b'|| correspondente=='c' ||correspondente=='d'|| correspondente=='f'|| correspondente=='g'|| correspondente=='h'|| correspondente=='j' ||correspondente=='k'|| correspondente=='l'|| correspondente=='m'|| correspondente=='n'|| correspondente=='p' ||correspondente=='q'|| correspondente=='r'|| correspondente=='s'|| correspondente=='t'|| correspondente=='v' ||correspondente=='w'|| correspondente=='x'|| correspondente=='y' || correspondente=='z'){
                consoantes += 1;
                }else 
                estranhos+=1;                       
            }
            System.out.println("Quantidade de vogais: "+ vogais + "\nQuantidade de consoantes: "+ consoantes + "\nOutros caracteres:"+ estranhos);

        } catch (Exception e) {
            e.printStackTrace();
        } 
        finally{
            try {
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    
}


