import java.util.List;

import com.shalintha.training.salesmanager.model.Employee;
import com.shalintha.training.salesmanager.service.EmployeeService;
import com.shalintha.training.salesmanager.service.EmployeeServiceImpl;

public class Application {
	
	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		
		List<Employee> employees = employeeService.getAllEmployees();
		
		for(Employee employee : employees) {
			System.out.println(employee.getEmployeeName() + " from " + employee.getEmployeeLocation());
			
		}
		
	}

}
