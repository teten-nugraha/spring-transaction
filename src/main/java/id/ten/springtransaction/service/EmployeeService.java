package id.ten.springtransaction.service;

import id.ten.springtransaction.model.Employee;

/**
 * Package: id.ten.springtransaction.service
 * <p>
 * User: TetenNugraha
 * Date: 8/18/2021
 * Time: 2:17 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface EmployeeService {

    void insertEmployee(Employee emp);

    void deleteEmployeeById(String empid);

}
