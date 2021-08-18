package id.ten.springtransaction.dao.impl;

import id.ten.springtransaction.dao.EmployeeDao;
import id.ten.springtransaction.model.Employee;
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
 * Time: 1:55 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class EmployeeDAOImpl extends JdbcDaoSupport implements EmployeeDao {

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public void insertEmployee(Employee emp) {
        String sql = "INSERT INTO employee " + "(empId, empName) VALUES (?, ?)";
        getJdbcTemplate().update(sql, new Object[] { emp.getEmpId(), emp.getEmpName() });
    }

    @Override
    public void deleteEmployeeById(String empid) {
        String sql = "DELETE FROM employee WHERE empId = ?";
        getJdbcTemplate().update(sql, new Object[] { empid });
    }
}
