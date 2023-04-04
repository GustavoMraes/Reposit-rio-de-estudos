public class Programa{
    public static void Main (String[] args){

      bool fimPrograma = false;



        //notas no tipo double pra receber números decimais
        double nota1 = 0; 
        double nota2 = 0; 
        //notas no tipo string para usarmos o tryParse para então garantirmos que o usuário digite a nota corretamente
        string snota1 = "";
        string snota2 = "";        
        
        double soma = 0;
        int alunos = 0;

        double media;

        double mediaClasse;

        
        

        while (!fimPrograma) // RODAR EM LOOP PARA ADICIONAR QUANTOS ALUNOS FOREM NECESSÁRIOS
        {
            Console.Write("Digite a nota 1: ");
            snota1 = Console.ReadLine(); //A NOTA ESTÁ SENDO LIDA COMO STRING PARA SER CONVERTIDA DEPOIS, COM O TRYPARSE


            //FAZENDO AS VERIFICAÇÕES -----------------------------------------------------------------------------
            

            while (!double.TryParse(snota1, out nota1)) // TryParse trata String, verifica se é um valor númerico e converte, ou seja, entra como String e sai como número. Se o retorno for não númerico retornará NaN.
            // O LOOP E NECESSÁRIO PARA GARANTIR QUE SERÁ DIGITADO UM NÚMERO, MESMO QUE O USUÁRIO ERRE  UM NÚMERO N DE VEZES.
            { 
                Console.Write("Nota Inválida. Digite uma nota válida: "); 
                snota1 = Console.ReadLine();
            } //fim do while do número 1


            Console.Write("Digite a nota 2: ");
            snota2 = Console.ReadLine();

            while (!double.TryParse(snota2, out nota2)) // MESMO PROCEDIMENTO QUE O NÚMERO 1. AQUI GARANTIMOS QUE O NÚMERO 2 TAMBÉM SERA UM NÚMERO
            { 
                Console.Write("Nota Inválida. Digite uma nota válida: "); 
                snota2 = Console.ReadLine();
            } // fim do while do número 2

            // FIM DAS VERIFICAÇÕES -------------------------------------------------------------------------------


            
            
            try // USAREMOS O TRY PARA VERIFICAR OUTROS ERROS
            {
                media = Media.Calculo(nota1, nota2); // CALCULAR A MEDIA COM O MÉTODO CÁLCULO DA CLASSE MEDIA (criada abaixo no código)

                if(double.IsNaN(media)) // CASO A MEDIA SEJA UM NÚMERO 
                {
                    Console.WriteLine("Essa operação resultará em um erro. \n");
                }
                else //CASO A MEDIA TENHA SIDO CRIADA CORRETAMENTE, EXIBIR A MEDIA
                   {
                    Console.WriteLine("A média do aluno foi: {0:0.##}\n", media); // APRESENTANDO O NUMERO COM DUAS DECIMAIS, COMO FOI PEDIDO
                    
                        alunos++; //QUANTIDADE DE ALUNOS. PARA CADA ALUNO REGISTRADO, ESSA VARIÁVEL AUMENTA EM 1.
                        soma = soma + media; // ESTA SOMA É O VALOR ADICIONADO PELA NOTA DE CADA ALUNO PELA TURMA, QUE DEPOIS SERÁ DIVIDIDO PELA QUANTIDADE DE ALUNOS
                    }
            }
            catch(Exception e) //
            {
                Console.WriteLine("Ocorreu uma exceção. \nDetalhes: "+e.Message);
            }

            Console.Write("Digite 'n' para encerrar a execução ou digite qualquer tecla para adicionar outro aluno: ");
            if (Console.ReadLine() == "n")
                fimPrograma = true;
            Console.WriteLine("\n");  

    } //FIM DO LOOP

    //QUANDO O USUÁRIO DIZER QUE DESEJA SAIR DO PROGRAMA, ELE SE ENCERRA E MOSTRA A MÉDIA DA CLASSE
    mediaClasse = soma/alunos;
    Console.Write("A média da turma foi {0:0.##}\n",  mediaClasse );
}


class Media
{
    public static double Calculo(double nota1, double nota2)
    {
        double media = (nota1 + nota2)/2;
        return media;
    }
}


}



