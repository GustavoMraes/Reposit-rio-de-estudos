using Classes;
public class Teste
{
    private static void Main(string[] args)
    {
        var conta = new ContaBancaria("Renato Fernandez", 1000.50m);
        Console.Write($"A conta {conta.Numero} foi criada por {conta.Cliente} com saldo inicial de {conta.Saldo}\n\n");

         conta.EfetuarDeposito(10000000000000, DateTime.Now, "Recebimento de um amigo");
        Console.WriteLine($"Saldo Atual de {conta.Saldo}\n");

        conta.EfetuarSaque(500, DateTime.Now, "Pagamento de aluguel");
        Console.WriteLine($"Saldo Atual de {conta.Saldo}\n");

       

    }
}