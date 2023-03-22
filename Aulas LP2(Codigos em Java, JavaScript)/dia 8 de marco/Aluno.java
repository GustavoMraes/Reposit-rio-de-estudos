import Pessoa;

public class Aluno extends Pessoa{

    private String prontuario;

    public Aluno(){
        super();
        this.prontuario = "";
    }
    public Aluno(String nome, int dia, int mes, int ano, String prontuario){
        super(nome,dia,mes,ano);
        this.prontuario = prontuario;        
    }

    public String getProntuario(){
        return prontuario;        
    }
    public void setProntuario(String prontuario){
        this.prontuario = prontuario;        
    }
    public String toString(){
        return super.toString() + "[prontuario: "+ prontuario + "]";
    }

    
}
