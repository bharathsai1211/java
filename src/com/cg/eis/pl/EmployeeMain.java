package com.cg.eis.pl;

import java.util.HashMap;
import java.util.Map;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeInsuranceSystem;

public class EmployeeMain {

	private static Map<Integer,Employee> employeemap=new HashMap<Integer,Employee>();
	private static int empCount=1;
	public static void main(String[] args) {
		
		Employee employee1=new Employee();
		employee1.setId(10);
		employee1.setName("bharath");
		employee1.setSalary(10000);
		EmployeeInsuranceSystem eSystem=new EmployeeInsuranceSystem();
		employee1.setDesination(eSystem.checkDesignation(employee1.getSalary()));
		employee1.setInsuranceScheme(eSystem.checkInsuranceScheme(employee1.getSalary()));
		EmployeeMain empMain=new EmployeeMain();
		empMain.addEmployeeDetails(employee1);
		System.out.println(empMain.displayByInsuranceScheme(employee1.getInsuranceScheme()));
		empMain.deleteEmployeeDetails(employee1.getId());
		System.out.println(employeemap.entrySet());
		

	}
	
	public void addEmployeeDetails(Employee employee)
	{
		employeemap.put(empCount,employee);
		empCount++;
	}
	public Employee displayByInsuranceScheme(String scheme)
	{
		for(Map.Entry<Integer, Employee> employee:employeemap.entrySet())
		{
			Employee employeeCheck=employee.getValue();
			if(employeeCheck.getInsuranceScheme().equals(scheme))
			{
				return employeeCheck;
			}
		}
		return null;
	}
	public void deleteEmployeeDetails(int id)
	{
		/*Iterator<Map.Entry<Integer,Employee>> itr=employeemap.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, Employee> emptodelete=itr.next();
			if(emptodelete.getValue().getId()==id)
			{
				itr.remove(emptodelete);
			}
		}*/
		for(Map.Entry<Integer, Employee> emptodel:employeemap.entrySet())
		{
			if(emptodel.getValue().getId()==id)
			{
				employeemap.remove(emptodel.getKey());
			}
		}
	}
	
	
	
	
	

}
