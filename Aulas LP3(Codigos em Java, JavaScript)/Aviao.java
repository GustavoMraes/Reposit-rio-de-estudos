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
        return "[ fabricante ="+ fabricante+" tipo: "+tipo +"]";
    }
    
}
