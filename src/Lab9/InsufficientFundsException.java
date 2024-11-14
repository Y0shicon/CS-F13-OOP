package Lab9;

/**
 * An InsufficientFundsException is thrown when a BankAccount determines
 * that it does not contain enough funds to perform a transaction (withdrawal).
 *
 * @author cs302
 */
public class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}
