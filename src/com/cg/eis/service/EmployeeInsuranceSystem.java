package com.cg.eis.service;

public class EmployeeInsuranceSystem implements EmployeeService {
	public  String checkInsuranceScheme(double salary)
	{
		if(salary>5000&&salary<20000)
		{
			return "Scheme C";
		}
		else if(salary>=20000&&salary<40000)
		{
			return "Scheme B";
		}
		else if(salary>=40000)
		{
			return "Scheme A";
		}
		return "No Scheme";
	}
	public String checkDesignation(double salary)
	{
		if(salary>5000&&salary<20000)
		{
			return "System Associate";
		}
		else if(salary>=20000&&salary<40000)
		{
			return "Programmer";
		}
		else if(salary>=40000)
		{
			return "Manager";
		}
		return "Clerk";
	}

}
