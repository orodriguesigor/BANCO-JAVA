import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String nome = "Sharpay Evans";
        String tipoConta = "Corrente";
        double saldo = 3567.80;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Fazer um PIX
                3 - Receber um PIX
                4 - Sair

                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é de: R$" + saldo);
            } else if(opcao ==2){
                System.out.println("Digite o valor do pix");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Você não possui saldo para esta operação");
                } else{
                    saldo -= valor;
                    System.out.println("Seu extrato atualizado é de: " + saldo);
                }
            } else if (opcao == 3){
                System.out.println("Qual o valor a receber?");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Seu extrato atualizado é de: " + saldo);
            }else if(opcao != 4){
                System.out.println("Opção inválida! Tente novamente.");
            }

        }
    }

}