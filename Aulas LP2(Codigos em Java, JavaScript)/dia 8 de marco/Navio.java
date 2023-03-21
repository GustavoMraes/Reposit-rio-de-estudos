import java.time.LocalDate;
public class Navio {
    //ATRIBUTOS
    private String nome;   
    private LocalDate funcionamento;


   
    //CONSTRUTORES
    public Navio(){
        this.nome = "";
        this.funcionamento = LocalDate.now();     
    }
    public Navio (String nome){
        this.nome = nome;
        this.funcionamento = LocalDate.now();        
    }

    public Navio(String nome, LocalDate funcionamento){
        this.nome = nome;
        this.funcionamento = funcionamento;
    }

    //MÉTODOS GET E SET
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getFuncionamento() {
        return funcionamento;
    }
    public void setFuncionamento(LocalDate funcionamento) {
        this.funcionamento = funcionamento;
    }

    //EQUALS

     //EQUALS
     @Override    
     public boolean equals(Object obj){
         if (this == obj)
         return true;
 
         if (obj==null)
          return false;
 
         
         if (this.getClass() !=obj.getClass())
             return false;
 
         Navio other = (Navio) obj;
 
         if (this.nome == null){
             if (other.nome != null)
         return false;
 
         }
         else if (! this.nome.equals(other.nome))
           return false;
 

           if (this.funcionamento == null){
             if (other.funcionamento != null)
         return false;
 
         }
         else if (! this.funcionamento.equals(other.funcionamento))
           return false;   

         return true;         
    } 

    //HASHCODE
    @Override
    public int hashCode(){
     int primo = 31;
     int resultado = 1;
     resultado = resultado*primo + ((nome==null)?0:nome.hashCode());
     resultado = resultado*primo + ((funcionamento==null)?0:funcionamento.hashCode());    
     return resultado;
    }


 //TOSTRING
 public String toString(){
    return super.toString() + "[nome: "+ nome + " funcionamento: "+ funcionamento; 
}



    
}