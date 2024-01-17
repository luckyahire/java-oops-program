package project5;

//This is Main class. It has d objests of child classes.
public class main {

	public static void main(String[] args) {
		
		// Object of Child class of Professor
		Professor myobj = new Professor();
		// Object of Child class of AssistantProfessor
		 AssistantProfessorm amit = new  AssistantProfessorm();
		 // Object of Child class of AssociateProfessor
		AssociateProfessor aman = new AssociateProfessor();
		//Object of Child class of Programmer
		Programmer vishal = new Programmer();
		
		// To calculate all the salary components & Actual Salary of Professor
		double value1 = myobj.calculateda(10000);
		double value2 = myobj.calculatepf(10000);	
		double value3 = myobj.calculatehra(10000);
		double value4 = myobj.calculatescf(10000);	
		double value5 = myobj.calculategrosssal(10000,value1,value3);
		double value6 = myobj.calculatednetsal(value5,value2,value4);
		
		// To display all the salary components & Actual Salary of Professor
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		System.out.println("");
		
		// To calculate all the salary components & Actual Salary of Assistant Professor
		double value7 = amit.calculateda(20000);
		double value8 = amit.calculatepf(20000);	
		double value9 = amit.calculatehra(20000);
		double value10 = amit.calculatescf(20000);	
		double value11 = amit.calculategrosssal(20000,value7,value9);
		double value12= amit.calculatednetsal(value11,value8,value10);
		
		// To display all the salary components & Actual Salary of Assistant Professor
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
		System.out.println(value11);
		System.out.println(value12);
		System.out.println("");
		
		// To calculate all the salary components & Actual Salary of Associate Professor
		double value13 = aman.calculateda(25000);
		double value14= aman.calculatepf(25000);	
		double value15= aman.calculatehra(25000);
		double value16 = aman.calculatescf(25000);	
		double value17 = aman.calculategrosssal(25000,value13,value15);
		double value18= aman.calculatednetsal(value17,value14,value16);
		
		// To display all the salary components & Actual Salary of Associate Professor
		System.out.println(value13);
		System.out.println(value14);
		System.out.println(value15);
		System.out.println(value16);
		System.out.println(value17);
		System.out.println(value18);
		System.out.println("");
		
		// To calculate all the salary components & Actual Salary of Programmer
		double value19 = vishal.calculateda(30000);
		double value20= vishal.calculatepf(30000);	
		double value21= vishal.calculatehra(30000);
		double value22 = vishal.calculatescf(30000);	
		double value23 = vishal.calculategrosssal(30000,value19,value21);
		double value24= vishal.calculatednetsal(value17,value14,value16);
		
		// To display all the salary components & Actual Salary of Programmer
		System.out.println(value19);
		System.out.println(value20);
		System.out.println(value21);
		System.out.println(value22);
		System.out.println(value23);
		System.out.println(value24);
		System.out.println("");
		
		
	}
}
