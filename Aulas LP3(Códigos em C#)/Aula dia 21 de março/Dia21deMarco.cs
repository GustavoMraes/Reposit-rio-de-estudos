//CONTINUANDO SOBRE LISTAS


/*
var peixes = new List<string> {"Bagre Ensaboado2", "Tilápia2", "Camarão2", "Sardinha2"};
peixes.Remove("Tilápia2");
foreach (var peixe in peixes)
{
    Console.WriteLine(peixe + "");
}


var numeros = new List<int>{0,1,2,3,4,5,6,7,8,9};
for (var index = 0; index<=numeros.Count-1; index++)
{
    if(numeros[index]%2==1)
    numeros.RemoveAt(index);
}
numeros.ForEa´ch(numero => Console.WriteLine(numero + ""));

*/
var nomes = new List<string>{"Renato", "Ana", "Felipe", "Claudia"};
foreach(var nome in nomes){
    Console.WriteLine($"Olá {nome.ToUpper()}");

}

 Console.WriteLine();
 nomes.Add("Maria");
 nomes.Add("Bill");
 nomes.Remove("Ana");
 foreach(var nome in nomes)
{
    Console.WriteLine($"Olá {nome.ToUpper()}!");
}

Console.WriteLine($"Meu nome é {nomes[0]}");
Console.WriteLine($"Adicionei {nomes[3]} e {nomes[4]} na lista");
Console.WriteLine($"A lista tem {nomes.Count} pessoas");

var index = nomes.IndexOf("Não encontrado");
if(index== -1)
Console.WriteLine($"Item não encontrado no index {index}");
else
Console.WriteLine($"O nome {nomes[index]} está no índice {index}");

nomes.Sort();
foreach (var nome in nomes)
{
    Console.WriteLine($"Olá {nome.ToUpper()}!");
}

var fibonacciNumeros = new List<int>{1,1};

var previo = fibonacciNumeros[fibonacciNumeros.Count-1];
var previo2 = fibonacciNumeros[fibonacciNumeros.Count-2];

for (int a=0; a<=17; a++){
    previo = fibonacciNumeros[fibonacciNumeros.Count-1];
    previo2 = fibonacciNumeros[fibonacciNumeros.Count-2];
fibonacciNumeros.Add(previo+previo2);

}
int b=1;
foreach(var item in fibonacciNumeros)
{       
    Console.WriteLine("o item "+ b+ ":" +item);
    b=b+1; 
}