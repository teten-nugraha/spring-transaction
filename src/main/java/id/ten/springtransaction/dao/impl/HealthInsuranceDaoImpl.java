package id.ten.springtransaction.dao.impl;

import id.ten.springtransaction.dao.HealthInsuranceDao;
import id.ten.springtransaction.model.EmployeeHealthInsurance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * Package: id.ten.springtransaction.dao.impl
 * <p>
 * User: TetenNugraha
 * Date: 8/18/2021
 * Time: 2:14 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class HealthInsuranceDaoImpl extends JdbcDaoSupport implements HealthInsuranceDao {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public void registerEmployeeHealthInsurance(EmployeeHealthInsurance emp) {
        String sql = "INSERT INTO employeeHealthInsurance "
                + "(empId, healthInsuranceSchemeName, coverageAmount) VALUES (?, ?,?)";
        getJdbcTemplate().update(sql,
                new Object[] { emp.getEmpId(), emp.getHealthInsuranceSchemeName(), emp.getCoverageAmount() });
    }

    @Override
    public void deleteEmployeeHealthInsuranceById(String empid) {
        String sql = "DELETE FROM employeeHealthInsurance WHERE empId = ?";
        getJdbcTemplate().update(sql, new Object[] { empid });

    }
}
