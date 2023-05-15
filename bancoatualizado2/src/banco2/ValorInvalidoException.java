
package banco2;

public class ValorInvalidoException extends Exception {
    
      ValorInvalidoException(double saldo) {
       super("Valor invalido: "+ saldo);
    }
     
 
}    

