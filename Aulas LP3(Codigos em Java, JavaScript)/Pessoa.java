import java.time.LocalDate;

public class Pessoa {

    // ATRIBUTOS

    private String nome;
    private LocalDate nascimento;


//MÉTODOS CONSTRUTORES

    public Pessoa(){
        this.nome = "";
        this.nascimento = LocalDate.now();
    }
    public Pessoa (String nome, Integer dia, Integer mes, Integer ano){
        this.nome = nome;
        this.nascimento = LocalDate.of(ano, mes, dia);
    }
    

//MÉTODOS GET E SET

public String getNome(){
    return this.nome;
}
public void setNome(String nome){
    this.nome = nome;
}

public LocalDate getNascimento(){
    return nascimento;
}

//MÉTODO ToSring

public String toString(){
    return "[nome: "+nome+ " nascimento: "+ nascimento+"]";
}

}
