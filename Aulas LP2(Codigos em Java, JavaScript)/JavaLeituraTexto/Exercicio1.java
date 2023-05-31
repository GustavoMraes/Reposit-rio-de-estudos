import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Exercicio1{
public static void main(String[] args) {
        FileWriter out = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a mesnagem");
        String mensagem = scan.nextLine();
        


        try
        {
            out = new FileWriter("saida.txt");             
            
            for(int i=0;i<=mensagem.length();i++){            
            out.write(mensagem.charAt(i));
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally{
            try {
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }



    }    
}