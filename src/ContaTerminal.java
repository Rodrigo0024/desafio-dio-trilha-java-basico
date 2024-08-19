

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.println("Por favor digite o numero da agencia! depois pressione Enter");
        int numeroUsuario = scanner.nextInt();

        System.out.println("Qual é sua agencia ?");
        String agencia = scanner.next();

        
        System.out.println("Digite o nome do cliente");
        String nome = scanner.next();

        System.out.println("Digite o sobrenome do cliente");
        String sobrenome = scanner.next();

        System.out.println("Informe o saldo  a ser depositado!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nome+" "+sobrenome+"  obrigado por criar uma conta em nosso banco, sua agência é "+
         agencia+ ", conta "+numeroUsuario+ " e seu saldo "+saldo+ " já está disponível para saque");





     

        //TODO: Conhecer e importar a classe Scanner


        //Exibir as mensagens para nosso usuario


        //Obter  pela classe scanner os valores digitados no terminal



        //exibir a mensagem final
    }
}
