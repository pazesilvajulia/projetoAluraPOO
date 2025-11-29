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

        System.out.println(String.format
                (
                        """
                        ***************** SUCESSO *******************
                        
                             O valor de R$ %.2f foi depositado!
                        
                        *********************************************   
                        
              
                        """, valorDepositado
                )
        );

        Menu.menuShow(cliente);
    }
}
