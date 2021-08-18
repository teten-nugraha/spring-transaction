package id.ten.springtransaction.service;

import id.ten.springtransaction.exception.InvalidInsuranceAmountException;
import id.ten.springtransaction.model.EmployeeHealthInsurance;

/**
 * Package: id.ten.springtransaction.service
 * <p>
 * User: TetenNugraha
 * Date: 8/18/2021
 * Time: 2:20 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface HealthInsuranceService {

    void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance) throws InvalidInsuranceAmountException;

    void deleteEmployeeHealthInsuranceById(String empid);

}
