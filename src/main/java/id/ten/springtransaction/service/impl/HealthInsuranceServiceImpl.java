package id.ten.springtransaction.service.impl;

import id.ten.springtransaction.dao.HealthInsuranceDao;
import id.ten.springtransaction.exception.InvalidInsuranceAmountException;
import id.ten.springtransaction.model.EmployeeHealthInsurance;
import id.ten.springtransaction.service.HealthInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HealthInsuranceServiceImpl implements HealthInsuranceService {

    @Autowired
    HealthInsuranceDao healthInsuranceDao;

    @Override
    public void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance)throws InvalidInsuranceAmountException {
        if(employeeHealthInsurance.getCoverageAmount() < 0) {
            throw new InvalidInsuranceAmountException("Coverage Amount Should not be negative");
        }
        healthInsuranceDao.registerEmployeeHealthInsurance(employeeHealthInsurance);
    }

    @Override
    public void deleteEmployeeHealthInsuranceById(String empid) {
        healthInsuranceDao.deleteEmployeeHealthInsuranceById(empid);
    }

}