package id.ten.springtransaction.service;

import id.ten.springtransaction.exception.InvalidInsuranceAmountException;
import id.ten.springtransaction.model.Employee;
import id.ten.springtransaction.model.EmployeeHealthInsurance;

/**
 * Package: id.ten.springtransaction.service
 * <p>
 * User: TetenNugraha
 * Date: 8/18/2021
 * Time: 2:21 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface OrganizationService {

    public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance) throws InvalidInsuranceAmountException;;

    public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

}
