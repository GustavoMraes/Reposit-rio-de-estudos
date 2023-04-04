namespace classes
{
    
public class Pessoa{
    private string nome;
    private int idade;

    public Pessoa (string nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }

    public string getNome(){
        return nome;
    }
    public void setNome(string nome){
        this.nome=nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }

    public string toString (){
//return ($"Nome: {nome}\n" + $" Idade: {idade}");
return ("Nome: "+ nome.ToUpper() + "  Idade: "+ idade);
    }


}
}
