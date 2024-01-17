package project5;
 
//This is parent class named as Shape. It has 9 variables and 6 Abstract methods.

 abstract public class Employee {
	
	String EmpName;
	long Empid;
	String EmpAdress;
	String MobileNo;
	String Empemailid;
	double da;
	double bp;
	double hra;
	double pf;
	double scf;
	

	abstract public double calculatepf();
	
	abstract public double calculateda();
	
	abstract public double calculatehra();
	
	
	abstract public double calculatescf();
	
	abstract public double calculategrosssal();
	
	abstract public double calculatenetsal();
}
