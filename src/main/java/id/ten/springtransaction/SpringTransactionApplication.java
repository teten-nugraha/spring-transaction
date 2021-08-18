package id.ten.springtransaction;

import id.ten.springtransaction.exception.InvalidInsuranceAmountException;
import id.ten.springtransaction.model.Employee;
import id.ten.springtransaction.model.EmployeeHealthInsurance;
import id.ten.springtransaction.service.OrganizationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTransactionApplication {

	public static void main(String[] args) throws InvalidInsuranceAmountException {
		ApplicationContext context = SpringApplication.run(SpringTransactionApplication.class, args);
		OrganizationService organizationService = context.getBean(OrganizationService.class);

		Employee emp = new Employee();
		emp.setEmpId("emp1");
		emp.setEmpName("emp1");

		EmployeeHealthInsurance employeeHealthInsurance = new EmployeeHealthInsurance();
		employeeHealthInsurance.setEmpId("emp1");
		employeeHealthInsurance.setHealthInsuranceSchemeName("premium");
		employeeHealthInsurance.setCoverageAmount(-1);

		organizationService.joinOrganization(emp, employeeHealthInsurance);
	}

}
