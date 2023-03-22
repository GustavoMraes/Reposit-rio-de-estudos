public class Teste {
    public static void main(String[] args) {
        Exercicio1 aa = new Exercicio1();
        RG_Exercicio2 rg = new RG_Exercicio2();
        System.out.println(rg.getNascimeto());
        System.out.println(rg.hashCode());
        Aluno_Exercicio3 Gustavo = new Aluno_Exercicio3("Gustavo", rg);
        Gustavo.hashCode();

    }
    
}
