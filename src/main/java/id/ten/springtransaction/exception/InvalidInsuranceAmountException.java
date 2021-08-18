package id.ten.springtransaction.exception;

/**
 * Package: id.ten.springtransaction.exception
 * <p>
 * User: TetenNugraha
 * Date: 8/18/2021
 * Time: 2:43 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class InvalidInsuranceAmountException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvalidInsuranceAmountException(String cause) {
        super(cause);
    }

}
