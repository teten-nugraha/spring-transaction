package id.ten.springtransaction.service.impl;

import id.ten.springtransaction.exception.InvalidInsuranceAmountException;
import id.ten.springtransaction.model.Employee;
import id.ten.springtransaction.model.EmployeeHealthInsurance;
import id.ten.springtransaction.service.EmployeeService;
import id.ten.springtransaction.service.HealthInsuranceService;
import id.ten.springtransaction.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Package: id.ten.springtransaction.service.impl
 * <p>
 * User: TetenNugraha
 * Date: 8/18/2021
 * Time: 2:22 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional
public class OrganzationServiceImpl implements OrganizationService {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    HealthInsuranceService healthInsuranceService;

    @Override
    @Transactional(rollbackFor = InvalidInsuranceAmountException.class)
    public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance) throws InvalidInsuranceAmountException {
        employeeService.insertEmployee(employee);
        try{
            healthInsuranceService.registerEmployeeHealthInsurance(employeeHealthInsurance);
        }catch (InvalidInsuranceAmountException e) {
            throw new InvalidInsuranceAmountException("Exception is throw");
        }
    }

    @Override
    @Transactional
    public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance) {
        employeeService.deleteEmployeeById(employee.getEmpId());
        healthInsuranceService.deleteEmployeeHealthInsuranceById(employeeHealthInsurance.getEmpId());
    }
}