public class Pessoa_Exercicio3 {
    

    //ATRIBUTOS
    private String nome;
    private RG_Exercicio2 identidade;
   
    
    //CONSTRUTORES
    public Pessoa_Exercicio3(){
        this.nome = "";
         RG_Exercicio2 identidade = new RG_Exercicio2();
       
    }
    public Pessoa_Exercicio3(String nome, String numero, Integer dia, Integer mes, Integer ano){
        this.nome = nome;
        this.identidade = new RG_Exercicio2(numero, dia, mes, ano);          
    }

    //GET E SET
    public String getnome() {
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public Object getNascimeto() {
        return identidade;
    }
    public void setidentidade(RG_Exercicio2 identidade) {
        this.identidade = identidade;
    }

    //EQUALS

    @Override    
     public boolean equals(Object obj){
         if (this == obj)
         return true;
 
         if (obj==null)
          return false;
 
         
         if (this.getClass() !=obj.getClass())
             return false;
 
         Pessoa_Exercicio3 other = (Pessoa_Exercicio3) obj;
 
         if (this.nome == null){
             if (other.nome != null)
         return false;
 
         }
         else if (! this.nome.equals(other.nome))
           return false;
 

           if (this.identidade == null){
             if (other.identidade != null)
         return false;
 
         }
         else if (! this.identidade.equals(other.identidade))
           return false;   

         return true;         
    } 

    //HASHCODE
    @Override
    public int hashCode(){
     int primo = 31;
     int resultado = 1;
     resultado = resultado*primo + ((nome==null)?0:nome.hashCode());
     resultado = resultado*primo + ((identidade==null)?0:identidade.hashCode());    
     return resultado;
    }


 //TOSTRING
 public String toString(){
    return super.toString() + "[nome: "+ nome + " identidade: "+ identidade; 
} 
}

