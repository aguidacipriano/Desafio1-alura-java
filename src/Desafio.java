import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Maria Madalena";
        String tipoConta = "Corrente";
        double  saldo = 1500;
        int opcao = 0;

        System.out.println("*****************************");
        System.out.println("\nCliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n****************************");

        String menu = """
                ** Digite sua opção **
                1- Saldo
                2- Saque
                3- Deposito
                4- Sair
                
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atual é de " + saldo);
            } else if (opcao == 2){
                System.out.println("Qual o valor que deseja sacar?");
                double  valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente para realizar o saque.");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado: " + saldo );
                }
            } else if (opcao == 3) {
                System.out.println("Qual o valor que deseja depositar?: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado: " + saldo );
            } else if (opcao !=4) {
                System.out.println("Opção inválida.");
            }
        }
    }
}
