public class Data {
    public static void dataShow(Cliente cliente){
        System.out.println(String.format
                (
                """
                ***********************DADOS DO CLIENTE***********************
                
                  NOME: %s
                  TIPO DA CONTA: %s
                  SALDO ATUAL: %.2f
                
                **************************************************************   
                """, cliente.getNome(), cliente.getTipoConta(), cliente.getSaldo()
                )
        );

    }

}
