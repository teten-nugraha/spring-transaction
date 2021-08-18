package id.ten.springtransaction.dao;

import id.ten.springtransaction.model.EmployeeHealthInsurance;

/**
 * Package: id.ten.springtransaction.dao
 * <p>
 * User: TetenNugraha
 * Date: 8/18/2021
 * Time: 2:14 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface HealthInsuranceDao {

    void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance);

    void deleteEmployeeHealthInsuranceById(String empid);

}
