
string[] alunos = new string[5] {"Renato", "Helenita", "Poliana", "Renata", "Venessa"};

//UTILIZANDO FOREACH

// Foreach apresenta a mesma função que o for neste caso
// Var é uma nova variável associada ao array
/*foreach(var aluno in alunos){
    Console.WriteLine(aluno);
}*/


//UTILIZANDO FOR

/*
for (int i=0; i<5; i++){
    Console.WriteLine(alunos[i]);
}*/



/*
string aulaIntro = "floatrodução às Coleções";
string aulaModelando = "Modelando a Classe Aula";
string aulaSets = "Trabalhando com Conjuntos";

string [] aulas = new string[4];
aulas[0] = aulaIntro;
aulas[1] = aulaModelando;
aulas[2] = aulaSets;float resultado;lando está no indice: " + Array.IndexOf(aulas, "asd"));*/
//Também funciona como LastIndexOf


double num1=0, num2=0;
string operacao;
Console.WriteLine("Digite um número, e pressione Enter");
num1= Convert.ToDouble(Console.ReadLine());
Console.WriteLine("Digite outro número, e pressione Enter");
num2= Convert.ToDouble(Console.ReadLine());
Console.WriteLine("Escolha uma opção da lista seguinte:");
Console.WriteLine("+  Soma");
Console.WriteLine("- Subração");
Console.WriteLine("* Multiplicação");
Console.WriteLine("/ Divisão");
Console.WriteLine("Qual a sua opção?");
operacao = Console.ReadLine();
switch(operacao){
    case "+":
    Console.WriteLine($"Seu resultado: {num1}+{num2} =" + (num1 + num2)); break;
    case "-":
    Console.WriteLine($"Seu resultado: {num1}-{num2} =" + (num1 - num2)); break;
    case "*":
    Console.WriteLine($"Seu resultado: {num1}*{num2} =" + (num1 * num2)); break;
    case "/":
    while(num2==0){
        Console.WriteLine("Erro = Divisão por zero\n Digite um número diferente de zero");
        num2 = Convert.ToDouble(Console.ReadLine());
    }
    Console.WriteLine($"Seu resultado: {num1}/{num2} =" + (num1 / num2)); break;
    default:
    Console.WriteLine("Operação inválida"); break;
}
Console.Write("Pressione qualquer tecla para fechar a Calculadora console app...\n");
Console.ReadKey();


