import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {

            boolean sair = false;
            Scanner lerDados = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = lerDados.nextLine();

        String tipoConta = "Corrente";
        double saldoUsuario = 3000.00;

            while (!sair) {
                System.out.println("***************************************");
                System.out.println("nome: " + nome);
                System.out.println("Tipo de conta: " + tipoConta);
                System.out.println("Saldo: " + saldoUsuario);
                System.out.println("***************************************");

                String menu = """
                        Operações:
                                        
                        1 - colsultar saldo.
                        2 - Receber valor.
                        3 - Transferir valor.
                        4 - Sair.
                        """;

                System.out.println(menu);

                System.out.println("Digite a operação que deseja realizar: ");
                int operacaoUsuario = lerDados.nextInt();

                if (operacaoUsuario == 1) {
                    System.out.println("Seu saldo atual é: " + saldoUsuario);

                } else if (operacaoUsuario == 2) {
                    System.out.println("Digite o valor recebido:  ");
                    double valorRecebido = lerDados.nextDouble();
                    saldoUsuario += valorRecebido;
                    System.out.println("Transferência de " + valorRecebido + " reais recebida.");
                    System.out.println("Seu saldo atual é " + saldoUsuario);

                } else if (operacaoUsuario == 3) {
                    System.out.println("Digite o valor que deseja transferir: ");
                    double valorTransferido = lerDados.nextDouble();

                    if(valorTransferido > saldoUsuario) {
                        System.out.println("Impossível realizar transação, seu saldo é insuficiente.");

                    } else {
                        saldoUsuario -= valorTransferido;
                        System.out.println("Transferência no valor de " + valorTransferido + " concluida com sucesso.");
                        System.out.println("Seu saldo atual é " + saldoUsuario);
                    }

                } else if (operacaoUsuario == 4) {
                    System.out.println("Operação finalizada!");
                    sair = true;

                } else {
                    System.out.println("Digite apenas as opções presentes no menu!");
                }

            }
    }
}
