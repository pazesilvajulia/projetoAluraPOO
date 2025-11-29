import java.util.Scanner;

public class Menu {
    public static void menuShow(Cliente cliente){
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while(running){
            System.out.println(String.format
                    (
                            """
                            *********************** MENU ***********************
                            
                              1 - Fazer depósito
                              2 - Sacar dinheiro
                              3 - Ver dados (inclui saldo atualizado)
                              4 - Encerrar programa
                            
                            ****************************************************   
                            
                            Digite a opcao desejada:
                            """
                    )
            );
            if(sc.hasNextInt()){
                int option = sc.nextInt();

                if (option != 1 && option != 2 && option != 3 && option != 4){
                    System.out.println("Opção inválida! Digite apenas opcoes presentes no menu.");
                    sc.next(); // limpa entrada errada
                    continue;

                } else{
                    switch (option){
                        case 1:
                            Deposit.makeDeposit(cliente);
                            break;

                        case 2:
                            Withdraw.makeWithdraw(cliente);
                            break;

                        case 3:
                            Data.dataShow(cliente);
                            break;

                        case 4:
                            System.out.println("Encerrando...");
                            running = false;
                            break;


                    }
                }
            } else {
                System.out.println("Opção inválida! Digite apenas números.");
                sc.next(); // limpa entrada errada
                continue;
            }



        }



    }
}
