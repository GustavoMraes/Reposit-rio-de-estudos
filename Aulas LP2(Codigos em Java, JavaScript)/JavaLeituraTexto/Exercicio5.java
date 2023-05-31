import java.util.Scanner;
import java.io.FileWriter;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        FileWriter out = null;
        String nota="";

        try {
            out = new FileWriter("num.txt");
        
        for(int i=1; i<=10;i++){
            System.out.println("Digite a "+i+"ª nota:  ");            
            nota = scan.nextLine();
            out.write(nota+"\n");                          
        }


    } catch (Exception e) {
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
