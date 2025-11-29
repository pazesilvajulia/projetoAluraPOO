import java.util.Scanner;

public class Withdraw {
    public static void makeWithdraw(Cliente cliente) {
        Scanner sc = new Scanner(System.in);

        System.out.println(String.format
                (
                        """
                        ******************* SAQUE *******************
                        
                                Digite o valor que será sacado!
                        
                        *********************************************   
                        
                        --> 
                        """
                )
        );
        float valorSacado = sc.nextFloat();

        cliente.setSaldo(cliente.getSaldo() - valorSacado);

        System.out.println(String.format
                (
                        """
                        ***************** SUCESSO *******************
                        
                                O valor de R$ %.2f foi sacado!
                        
                        *********************************************   
                        
              
                        """, valorSacado
                )
        );

        Menu.menuShow(cliente);
    }
}
