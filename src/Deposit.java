import java.util.Scanner;

public class Deposit {
    public static void makeDeposit(Cliente cliente){
        Scanner sc = new Scanner(System.in);

        System.out.println(String.format
                (
                        """
                        ***************** DEPÓSITO ******************
                        
                             Digite o valor que será depositado!
                        
                        *********************************************   
                        
                        --> 
                        """
                )
        );
        float valorDepositado = sc.nextFloat();

        cliente.setSaldo(cliente.getSaldo() + valorDepositado);
    }
}
