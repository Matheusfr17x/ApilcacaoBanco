package banco2;

public class testaExeptionMeu {

    public static void main(String[] args) {

        try {
            Conta cp = new ContaPoupanca();
            cp.deposita(-100);
        } catch (ValorInvalidoException e) {
            System.out.println("Erro: "+e.getMessage());
        }

    }
}
