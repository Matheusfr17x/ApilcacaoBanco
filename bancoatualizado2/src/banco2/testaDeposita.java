package banco2;

public class testaDeposita {
    public static void main(String[] args) {
        
        try {
            Conta cp = new ContaPoupanca();
            cp.deposita(-100);
        } catch (ValorInvalidoException mensagem) {
            System.out.println(""+ mensagem.getMessage());
        }
        
    }
}
