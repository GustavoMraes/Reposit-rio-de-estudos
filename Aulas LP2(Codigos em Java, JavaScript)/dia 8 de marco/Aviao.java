public class Aviao {
    //ATRIBUTOS
    private String fabricante;
    
    private String tipo;
//CONSTRUTORES
    public Aviao(){
        this.fabricante = "";
        this.tipo = "";
    }
    public Aviao(String fabricante){
        this.fabricante = fabricante;
        this.tipo = "";
    }
    public Aviao(String fabricante, String tipo){
        this.fabricante = fabricante;
        this.tipo = tipo;        
    }

    //METODOS GET E SET
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //TO STRING
    public String toString(){
        return "[ fabricante ="+ this.fabricante+" tipo: "+this.tipo +"]";
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

        Aviao other = (Aviao) obj;

        if (this.fabricante == null){
            if (other.fabricante != null)
        return false;
        }        
        else if (! this.fabricante.equals(other.fabricante))
          return false;

          if (this.tipo == null){
            if (other.tipo != null)
        return false;
        }        
        else if (! this.tipo.equals(other.tipo))
          return false;

        return true;         
   } 
}
