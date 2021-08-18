package id.ten.springtransaction.dao;

import id.ten.springtransaction.model.Employee;

/**
 * Package: id.ten.springtransaction.dao
 * <p>
 * User: TetenNugraha
 * Date: 8/18/2021
 * Time: 1:55 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface EmployeeDao {

    void insertEmployee(Employee cus);

    void deleteEmployeeById(String empid);

}
