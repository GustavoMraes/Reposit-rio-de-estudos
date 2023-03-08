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
    public boolean equalsMobile(Mobile obj){
        if (this == obj)
        return true;

        if (obj==null)
        return false;

        if(getClass() != obj.getClass())
        return false;

        Mobile other = (Mobile) obj;
        //CONTINUAR COPIADO DAQUI



        
return true;


    }
}
