package id.ten.springtransaction.service.impl;

import id.ten.springtransaction.dao.EmployeeDao;
import id.ten.springtransaction.model.Employee;
import id.ten.springtransaction.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Package: id.ten.springtransaction.service.impl
 * <p>
 * User: TetenNugraha
 * Date: 8/18/2021
 * Time: 2:18 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public void insertEmployee(Employee employee) {
        employeeDao.insertEmployee(employee);
    }

    @Override
    public void deleteEmployeeById(String empid) {
        employeeDao.deleteEmployeeById(empid);
    }

}