public class Funcionario extends Pessoa{
    //ATRIBUTOS
    private String rg;
    
    private String cpf;

    //CONSTRUTORES    
    public Funcionario(){
        this.rg = "";
        this.cpf = "";
    }
    
    public Funcionario(String rg, String cpf){
        this.rg = rg;
        this.cpf = cpf;
    }

    public Funcionario(String nome, Integer dia, Integer mes, Integer ano, String rg, String cpf){
        super(nome,dia,mes,ano);
        this.rg = rg;
        this.cpf = cpf;
    }
//GET E SET
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //TOSTRING
    public String toString(){
        return super.toString() + "[cpf: "+ cpf + " rg: "+ rg+ "]";
    }

    

}
