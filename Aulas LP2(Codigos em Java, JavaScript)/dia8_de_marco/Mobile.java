public class Mobile {
    //ATRIBUTOS
    private String marca; 
    private String modelo;

    //CONSTRUTORES    
    public Mobile(){
        this.marca = "";
        this.modelo = "";
    }
    
    public Mobile(String marca){
        this.marca = marca;
        this.modelo = "";
    }

    public Mobile(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    //METODOS GET E SET

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //TO STRING 
    public String toString(){
        return "[ marca ="+ marca+" modelo: "+modelo +"]";
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

        Mobile other = (Mobile) obj;

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

        return true;         
   } 

   //HASHCODE

   @Override
   public int hashCode(){
    int primo = 31;
    int resultado = 1;
    resultado = resultado*primo + ((marca==null)?0:marca.hashCode());
    resultado = resultado*primo + ((modelo==null)?0:modelo.hashCode());
    return resultado;
   }
}
