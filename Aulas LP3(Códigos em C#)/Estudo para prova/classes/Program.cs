using System;
using classes;

namespace MyProgram
{
    class Program
    {
        public static void Main(string[] args)
        {


Pessoa Gustavo = new Pessoa("Gustavo", 17);
Console.WriteLine(Gustavo.getIdade());
Gustavo.setIdade(123);
Console.WriteLine(Gustavo.getIdade());
Console.WriteLine(Gustavo.toString());
        }
    }
}
