import java.util.Scanner;

public class AplicativoBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        int saldo = 2000;

        do {
            System.out.println("Operações");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println("Digite a opção desejada");
            opcao = scanner.nextInt();

            if (opcao < 1 || opcao > 4){
                System.out.println("Opção inválida. Digite uma opção válida.");
            continue;
        }

        switch (opcao)   {

            case 1:
                System.out.println("Seu saldo é de R$"+saldo);
                break;
            case 2:
                System.out.println("Digite o valor:");
                int deposito = scanner.nextInt();
                int valorAtualizado = deposito + saldo;
                System.out.println("Seu saldo é de R$" +valorAtualizado);
                break;
            case 3:
                System.out.println("Digite o valor da transferência:");
                int transferencia = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Deseja realizar a transação, digite S para (Sim) e N para (Não)");
                String confirmacao = scanner.nextLine();


                if (confirmacao.equals("N")) {
                    System.out.println("Operação cancelada:");

                }else if (saldo < transferencia){
                    System.out.println("Digite um valor menor ou igual ao disponível R$" +saldo);
                } else {
                    int saldoAtualizado = saldo - transferencia;
                    System.out.println("O valor transferido foi de R$" +transferencia+ " e seu saldo atual é de R$" +saldoAtualizado);
                    break;
                }
        }
        } while(opcao != 4);

        scanner.close();

    }
}








