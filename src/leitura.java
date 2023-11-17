import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
      Scanner lerDados = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = lerDados.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = lerDados.nextInt();

        System.out.println("Digite o valor que deseja investir para ficar rico: ");
        double investimento = lerDados.nextDouble();

        System.out.println("Olá " + nome + " com apenas " + idade + " anos e já tem " + investimento + " reais para investir? voce e o bichao mesmo");


    }
}
