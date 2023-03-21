public class Carro {
    //ATRIBUTOS

    private String modelo;   
    private String marca;
    private String cor;

    //CONSTRUTORES

    public Carro(){
        this.modelo = "";
        this.marca = "";
        this.cor = "";
    }
    public Carro(String modelo){
        this.modelo = modelo;
        this.marca = "";
        this.cor = "";
    }
    public Carro(String modelo, String marca, String cor){
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
    }

    //MÉTODOS GET E SET

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
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
 
         Carro other = (Carro) obj;
 
         if (this.modelo == null){
             if (other.modelo != null)
         return false;
 
         }
         else if (! this.modelo.equals(other.modelo))
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
 resultado = resultado*primo + ((modelo==null)?0:modelo.hashCode());
 resultado = resultado*primo + ((modelo==null)?0:cor.hashCode());
 return resultado;
}

    //TOSTRING
    @Override
    public String toString(){
        return super.toString() + "[Modelo: "+ modelo + " Marca: "+ marca+ " Cor: "+cor; 
}


}

