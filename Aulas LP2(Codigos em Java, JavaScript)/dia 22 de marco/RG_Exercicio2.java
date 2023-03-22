// A classe Collections é focada em funcionalidades sobre listas. Para isso, ela usa exclusivamente métodos estáticos, que focam em retornar valores destas listas.
// A classe Collections foi implementada na versão 1.2 do Java.

import java.time.LocalDate;


class RG_Exercicio2{
    //ATRIBUTOS
    private String numero;    
    private LocalDate nascimento;  
    
    //CONSTRUTORES
    public RG_Exercicio2(){
        this.numero = "";
        this.nascimento = LocalDate.now();  
    }
    public RG_Exercicio2(String numero, Integer dia, Integer mes, Integer ano){
        this.numero = numero;
        this.nascimento = LocalDate.of(ano, mes, dia);
    }

    //GET E SET
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public LocalDate getNascimeto() {
        return nascimento;
    }
    public void setNascimeto(LocalDate nascimeto) {
        this.nascimento = nascimeto;
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
 
         RG_Exercicio2 other = (RG_Exercicio2) obj;
 
         if (this.numero == null){
             if (other.numero != null)
         return false;
 
         }
         else if (! this.numero.equals(other.numero))
           return false;
 

           if (this.nascimento == null){
             if (other.nascimento != null)
         return false;
 
         }
         else if (! this.nascimento.equals(other.nascimento))
           return false;   

         return true;         
    } 

    //HASHCODE
    @Override
    public int hashCode(){
     int primo = 31;
     int resultado = 1;
     resultado = resultado*primo + ((numero==null)?0:numero.hashCode());
     resultado = resultado*primo + ((nascimento==null)?0:nascimento.hashCode());    
     return resultado;
    }


 //TOSTRING
 public String toString(){
    return super.toString() + "[numero: "+ numero + " nascimento: "+ nascimento; 
}


    



    


}
