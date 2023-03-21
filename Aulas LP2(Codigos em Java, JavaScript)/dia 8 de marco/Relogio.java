public class Relogio {
    //ATRIBUTOS
    private Boolean tamanho;   
    private String marca;
    private String cor;

    //CONSTRUTORES
    public Relogio(){
        this.tamanho = true;
        this.marca = "";
        this.cor = "";
    }
    public Relogio(Boolean tamanho){
        this.tamanho = tamanho;
        this.marca = "";
        this.cor = "";
    }
    public Relogio(Boolean tamanho, String marca, String cor){
        this.tamanho = tamanho;
        this.marca = marca;
        this.cor = cor;
    }

    //MÉTODOS GET E SET

    public Boolean getTamanho() {
        return tamanho;
    }
    public void setTamanho(Boolean tamanho) {
        this.tamanho = tamanho;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
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
 
         Relogio other = (Relogio) obj;
 
         if (this.tamanho == null){
             if (other.tamanho != null)
         return false;
 
         }
         else if (! this.tamanho.equals(other.tamanho))
           return false;
 

           if (this.marca == null){
             if (other.marca != null)
         return false;
 
         }
         else if (! this.marca.equals(other.marca))
           return false;

           if (this.cor == null){
            if (other.cor != null)
        return false;

        }
        else if (! this.cor.equals(other.cor))
          return false;


 
         return true;         
    } 

    


//HASHCODE
@Override
public int hashCode(){
 int primo = 31;
 int resultado = 1;
 resultado = resultado*primo + ((marca==null)?0:marca.hashCode());
 resultado = resultado*primo + ((cor==null)?0:cor.hashCode());
 resultado = resultado*primo + ((tamanho==null)?0:cor.hashCode());
 return resultado;
}

    //TOSTRING
    public String toString(){
        return super.toString() + "[tamanho: "+ tamanho + " Marca: "+ marca+ " Cor: "+cor; 
}

}