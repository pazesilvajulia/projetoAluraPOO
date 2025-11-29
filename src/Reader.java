import java.util.Scanner;

public class Reader {

    public static Cliente dataReader(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String nome = sc.nextLine();

        System.out.println("Digite o tipo da conta do cliente:");
        String tipoConta = sc.nextLine();

        System.out.println("Digite o saldo atual da conta:");
        double saldo = sc.nextDouble();


        return new Cliente(nome, tipoConta, saldo);
    }
}
