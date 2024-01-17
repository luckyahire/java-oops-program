package project1;

 public class main  {
	   public static void main (String[]args) {
		   
		  //Object of Child class of commercialBill
		   CommercialBill cbill= new CommercialBill();
		   
		   //Object of Child class of domesticBill
		   DomesticBill dbill = new DomesticBill();
		   
		// Calculated Values of Units Consumed.
		   long value1 = cbill.calculateunitconsume(1000, 500);
		   long value2 = dbill.calculateunitconsume(1000, 500);
		   
		   long Amount1 = cbill.billAmount(value1);
		   long Amount2 = dbill.billAmount(value2);
		   
		// To display Values of Units Consumed.
		   System.out.println(" commercial unit consume  " + value1);
		   System.out.println(" domestic unit consume " + value2);
		   System.out.println(" the commercial amount is " + Amount1);
		   System.out.println(" the domestic amount is " + Amount2);
		   
				   
	   }

}
