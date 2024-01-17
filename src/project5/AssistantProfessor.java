package project5;

//This is child class named as AssistantProfessor. It has Abstract methods inherited from Employee.

 class AssistantProfessorm extends Employee {

	// This method calculates DA of Assistant Professor. It takes Basic pay as a
		// parameter.

	 public double calculateda(double bp) {
		 double da = bp*(97.00/100.00);
		 return da;
	 }
	// This method calculates PF of Assistant Professor. It takes Basic pay as a
		// parameter.

	 public double calculatepf(double bp) {
		 double pf = bp*(12.00/100.00);
		 return pf;
	 }
	 

		// This method calculates HRA of Assistant Professor. It takes Basic pay as a
		// parameter

	 public double calculatehra(double bp) {
		 double hra = bp*(10.00/100.00);
		 return hra;
	 }
	// This method calculates Staff Club Fund of Assistant Professor. It takes Basic
		// pay as a parameter.

	 public double calculatescf(double bp) {
		 double scf = bp*(0.1/100);
		 return scf;
	 }
	 
	// This method calculates Gross Salary of Assistant Professor. It takes Basic
		// pay, DA,H RA as parameters.

	 public double calculategrosssal(double bp, double da, double hra) {
		 double gross = bp+da+hra;
		 return gross;
	 }
	 
//		This method calculates Nett Salary of Assistant Professor. It takes Gross Salary, PF, Staff Club Fund
//		as parameters.

	 public double calculatednetsal(double grosssal,double pf, double scf) {
		 double net = grosssal-pf-scf;
		 return net;
	 }

	@Override
	public double calculatepf() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateda() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculatehra() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculatescf() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculategrosssal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculatenetsal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
