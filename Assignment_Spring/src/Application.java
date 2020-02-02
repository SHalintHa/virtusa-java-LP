import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shalintha.training.salesmanager.model.Employee;
import com.shalintha.training.salesmanager.service.EmployeeService;
import com.shalintha.training.salesmanager.service.EmployeeServiceImpl;

public class Application {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		EmployeeService employeeService = new EmployeeServiceImpl();
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		
		List<Employee> employees = employeeService.getAllEmployees();
		
		for(Employee employee : employees) {
			System.out.println(employee.getEmployeeName() + " from " + employee.getEmployeeLocation());	
		}
		
	}

}
