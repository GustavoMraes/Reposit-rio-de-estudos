import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class Exercicio4 {
    public static void main(String[] args) {
        
        FileReader in = null;
        FileWriter out = null;
        int c=0;
        char correspondente=' ';
        String total="";
        StringTokenizer st;
        double nota=0;
        double notaFinal=0;
        int totalNotas=0;

        try {
            
            in = new FileReader("notas.txt");
            

            while((c=in.read())!=-1)
            {
                correspondente = (char)c;
                total = total+correspondente;                               
            }
            st = new StringTokenizer(total);
            
            for (int i=0; i<=st.countTokens();i++)
            {
                nota = Double.parseDouble(st.nextToken());
                notaFinal = nota+ notaFinal;
                totalNotas+=1;
                
            }
            notaFinal= notaFinal/totalNotas;
            out = new FileWriter("notas.txt");
            out.write(total);
            out.write("\n Média das notas: "+ notaFinal);         
             
        } catch (Exception e) {
            e.printStackTrace();
        } 
        finally{
            try {
                in.close();
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }   
    }
}
